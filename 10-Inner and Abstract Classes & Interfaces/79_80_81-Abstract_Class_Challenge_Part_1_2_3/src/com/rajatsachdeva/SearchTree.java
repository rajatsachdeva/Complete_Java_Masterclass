package com.rajatsachdeva;

// Tree can be defined as a root with left and right tree
// will be using recursion
public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // the tree is empty, so item becomes the root of the tree
            this.root = newItem;
            return true;
        }

        // Otherwise, start comparing from root of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);

            if (comparison < 0) {
                // if newItem is greater than currentItem, move to right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // There's no node to right, so add at this point only
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // if newItem is less than currentItem, move to left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // There's no node to left, so add at this point only
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present. Will not be added");
                return false;
            }
        }
        // We can't actually get here, this is just to keep the compiler happy
        return false;
    }

    @Override
    public boolean removeItem(ListItem newItem) {
        if (newItem != null) {
            System.out.println("Deleting item " + newItem.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        int comparison = 0;

        while (currentItem != null) {
            comparison = currentItem.compareTo(newItem);

            if (comparison < 0) {
                // newItem is greater than the currentItem, go Right
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                // newItem is less than the currentItem, go Left
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: this node needs to be removed
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            /** if item has no right tree, so make parent point to left tree root (which can also be null)
             *    parent           parent
             *      /                 \
             *    item                item
             *     / \                 / \
             *    / (x)               /  (x)
             *   left child          left child
             *      / \                 / \
             *     .  .                .  .
             **/
            if (parent.next() == item) {
                // item is right child of it's parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of it's parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            /** if item has no left tree, so make parent point to right tree root (which can also be null)
             *    parent           parent
             *      /                 \
             *    item                item
             *     / \                 / \
             *   (x) \              (x)  \
             *   left child          left child
             *      / \                 / \
             *     .  .                .  .
             **/
            if (parent.next() == item) {
                // item is right child of it's parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of it's parent
                parent.setPrevious(item.next());
            } else {
                // parent must be item which means we were looking at the root of the tree
                this.root = item.next();
            }
        } else {
            /** if item has both left and right tree
             * deletion is trickier !
             * From the right sub-tree, find the smallest value (i.e., the leftmost). Inorder Traversal?
             *    parent           parent
             *      /                 \
             *    item                item
             *     / \                /  \
             *    /   \              /    \
             *   left right        left  right
             *   / \   / \         / \    / \
             *  .  .  .  .        .  .   .  .
             **/
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());

            // And delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to the smallest node's right child( which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            // go to left
            traverse(root.previous());
            // print root
            System.out.println(root.getValue());
            // go to right
            traverse(root.next());
        }
    }
}
