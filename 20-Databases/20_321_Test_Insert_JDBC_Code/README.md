# Lecture 321 - Test Insert JDBC Code

Using prepared statement/ pre-compiled statements, we can only substitute the values of fields.
We can't substitute the column names/ tables names etc.

So it's good practice to use `PreparedStatement` because of the potential performance benefit, and because they 
protect the database against SQL injection attacks. Of course, that doesn't mean our database can't be hacked, but 
just that it can't be hacked using that particular type of attack.

So, to recap, we do the following to use a `PreparedStatement`: <br/>
1. Declare a constant for the SQL statement that contains the placeholders
2. Create a `PreparedStatement` instance using `Connection.prepareStatement(sqlStmtString)`
3. When we're ready to perform the query (or the `insert, update, delete`), we call the appropriate setter methods to 
set the placeholders to the values we want to use in the statement
4. We run the statement using `PreparedStatement.execute()` or `PreparedStatement.executeQuery()`
5. We process the results the same way we do when using a regular old Statement

Now about the **transactions**.<br/>
Because the JDBC Connection class auto commits changes by default, every time we call execute() to insert, update, or
delete records, those changes are saved to the database as soon as the SQL statements completes. Sometime that what 
we want, but often, it's not. 
 
For example, let's say our application is a web portal that people use to do online banking. One of the things they 
can do is transfer money from one account to another. When they do this, we have to run SQL statements: 

1. Update the _source_ account with the new balance
2. Update the _destination_ account with the new balance  
 
What would happen if we executed the first statement successfully, but the second statement failed for some reason. 
Let's say the source account has a balance of $1000.00, and the destination account has a balance of $100.00. The 
customer wants to transfer $200.00 into the destination account.

In step 1 we update the record for the source account so that it has a balance of $800.00. In step two, we update the
destination account so that it has a balance of $300.00. If the step one completes, but two fails, the $200.00 we're 
transferring will go missing.

Hopefully we'd notice the failure, but then we'd have to write code that would handle any failures by adding the 
money back to the source account. But what happens if we can't do that because the second step failed because the 
database is down, or can't be reached ? What then ? 

Here's another scenario. Let's suppose we want to add a new song to the music database. What do we have to do ?

1. Add the artist for the song to the arists table 
2. Add the album the song is on the albums table
3. Add the song to songs table

what happens if we complete step 1, but then steps 2 and 3 keep failing. Maybe we're trying to do this over the 
internet and we lose our connection.

This wouldn't be as bad a situation as the banking one, but we would end up with records in the artists and/or albums
that aren't associated with any songs. The integrity of the data in the database would be compromised.

It would be nice if when we wanted to accomplish something that requires multiple SQL statements, we could run all 
the statements as a single unit. Either all the SQL statements would successfully complete, or none of them would. 
**_(Atomic in Nature)**_ 

This is where transactions come in. A transaction is a sequence of SQL statements that are treated as a single 
logical unit. If any of statement fail, the results of any previous statements in the transaction fail, the results 
of any previous statements in the transaction can be rolled back, or just not saved. It's as if they never happened.

In the banking case, if step 2 failed, then the balance in the source account would be rolled back to its original 
value. In the music case, if steps 1 and 2 are successful, but step 3 fails, then steps 1 and 2 are rolled back. The 
artist and album are never saved in the artists and albums tables.

Commit means saving the information in database

Data transactions must be **_ACID_** compliant. The must following characteristics:

1. **Atomicity** : This relates to what discussed above. If a series of SQL statements change the database, then 
either all the changes are committed, or none of them are.

2. **Consistency** : Before a transaction begins, the database is in a valid state. When it completes, database is 
still in a valid state.

3. **Isolation** : Until the changes committed bu a transaction are completed, they won't be visible to other 
connections. Transactions can't depend on each other.

4. **Durability** : Once the changes performed by a transaction are committed to the database, they're permanent. If 
an application then crashes or the database server goes down (in the case of a client/server database like MySQL), 
the changes made by the transaction are still there when the application runs again, or database comes back up.

Essentially transactions ensure the integrity of the data within a database.

We only have to use transactions when we change the data in a database. We don't need them if we're querying the 
database, since we're not changing any data. Sqlite uses transaction by default, and auto-commits by default. In 
fact, no changes can be made to the database outside a transaction. When we were working with the contacts database, 
every time we used UDPATE, INSERT or DELETE, sqlite was creating a transaction, running the statement, and then 
committing the changes.

As we learned earlier, the JDBC Connection class auto-commits changes by default. When we turned off auto-commit, 
sqlite stopped auto-committing the changes, but they were still made as part of a transaction.

When working with sqlite, the following commands are used for transactions:

1. BEGIN TRANSACTION - we use this to manually start a transaction.
2. END TRANSACTION - use this to end a transaction. Committing changes automatically ends a transaction. Also, ending
 a transaction commits any changes. In other words, END TRANSACTION and commit are aliases. We only have to use one 
 when we want to end a transaction and commit the changes.
3. COMMIT - we use this to commit the changes made by a transaction. As mentioned, this ends the transaction. As 
mentioned, this ends the transaction, so we don't need to also run the END TRANSACTION command.
4. ROLLBACK - this rollbacks any uncommitted changes and ends the transaction. Note that it can only rollback changes
 that have occurred since the last COMMIT or ROLLBACK.
 
Note that if we close a connection before we commit any outstanding changes the changes are rolled back.

When using JDBC, we don't code the transaction-related SQL statements and use Statement objects to execute them.
We call methods in the Connection class to execute transaction-related comands. We perform the following steps:

1. Turn off the default auto-commit behaviour by calling `Connection.setAutoCommit(false)`
2. Perform the SQL operations that form the transaction
3. If there are no errors, call `Connection.commit()` to commit the changes. If there are errors, call `Connection
.rollback()` to rollback any changes made since the transaction began.
4. Turn the dafault auto-commit behaviour back on by calling setAutoCommit(true)

To demonstrate a transaction, we'll add the code to insert a song into the songs table, which has columns for the 
song title, the _id, the _id for the album the song is on, and the track number of the song on the album.

When we want to add a song, how do we get the _id for the album ? As we pointed out earlier, before adding a song, we
 have to add the album it's on to the albums table, which has the column for the _id, the name of the album, and the 
 _id for the artist. How do we get the artist _id ? We'll have to add the artist to the artists table before adding 
 the album. Of course, if there is already a record for the artist or album, then we won't want to add them again, so
  we'll have to check for that case.
  
To add a song, the user has to provide the song title, the album it's on, the artist, and the track number for this 
song.

So, we'll perform the following steps: 
1. Get the title, album, track number, and the artist(we'll just have the main() methods pass them as parameters, 
rather than prompting for them)
2. Check to see the there's a record for the artists in the artists table. If yes, go to Step 4. If no, do step 3
3. Add the artist to the artists table.
4. Check to see if the album is in the albums table. If yes, go to step 6. Otherwise, do step 5
5. Add the album to the albums table.
6. Add the song to songs table

We'll want all the insertions to take place within a single transaction, so that we don't end up with records in the 
artists table that aren't associated with any albums/ songs or with albums that aren't associated with any songs.

We should check for the existence of the song too, before we add it. But since more than one song can have the same 
title, we'd have to check that the album was also the same, and the artist was also the same, which would involve 
querying all three tables (check in the view ?)

So we're going to assume that we know the song doesn't already exist, so we can focus on using a transaction when 
inserting a song. In real-world application we wouldn't make this assumption.

Also we're not going to worry about updating the artist_list view. In a real-world application, we'd also have to 
update the view.

We'll need an INSERT statement for each table. We'll use PreparedStatements for the following: 

INSERT INTO artists(name) VALUES (?)
INSERT INTO albums(name, artist) VALUES (?, ?)
INSERT INTO songs(track, title, album) VALUES (?, ?, ?)