# Lecture 183 - BufferedReader

[the try with resource statement](https://docs.oracle.com/javase/7/docs/technotes/guides/language/try-with-resources.html)<br/>

**Challenge:**
here is your mini challenge why is the file reader object not closed despite me saying that closing streams are very
important and a hint here is to remember that you can view the source code for Java objects and methods by control 
or command clicking on the method see if you can figure that out and come back come when you ready and we will go 
through and solve this mini challenge so see you when you get back pause the video now.

Solution
``` /**
     * Closes this scanner.
     *
     * <p> If this scanner has not yet been closed then if its underlying
     * {@linkplain java.lang.Readable readable} also implements the {@link
     * java.io.Closeable} interface then the readable's <tt>close</tt> method
     * will be invoked.  If this scanner is already closed then invoking this
     * method will have no effect.
     *
     * <p>Attempting to perform search operations after a scanner has
     * been closed will result in an {@link IllegalStateException}.
     *
     */
 ```

 Use of BufferedReader <br/>
 Reading using BufferedReader , input is not done in character by character or byte by byte fashion but its done using a buffer 
 with default size of buffer equal to 8 KB. This basically is very effecient rather reading from the file stream byte by byte.
