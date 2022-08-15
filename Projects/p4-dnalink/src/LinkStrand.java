public class LinkStrand implements IDnaStrand {
    // freya
    // michelle

    private class Node {
        String info;
        Node next;
        Node(String s, Node link) {
            info = s;
            next = link;
        }
    }

    private Node myFirst;
    private Node myLast;
    private long mySize;
    private int myAppends;
    private int myIndex;
    private Node myCurrent;
    private int myLocalIndex;
    private Node myTemp;


    public LinkStrand(String s) {
        initialize(s);
    }
    public LinkStrand() {
        this("");
    }

    @Override
    public long size() {
        return mySize;
    }

    @Override
    public void initialize(String source) {
        myFirst = new Node(source, null);
        myLast = myFirst;
        mySize = source.length();
        myIndex = 0;
        myCurrent = myFirst;
        myLocalIndex = 0;
        myAppends = 0;

    }

    @Override
    public IDnaStrand getInstance(String source) {
        return new LinkStrand(source);
    }

    @Override
    public IDnaStrand append(String dna) {

        myLast.next = new Node(dna, null);
        myLast = myLast.next;
        mySize += dna.length();

        myAppends++;
        return this;
    }

    @Override
    public IDnaStrand reverse() {
        LinkStrand rev = new LinkStrand();
        //LinkStrand original = this;
        Node n = myFirst;
        //StringStrand ss = new StringStrand(n.info);
        //rev.myFirst = new Node(ss.reverse().toString(), null);
        //rev.mySize += rev.myFirst.info.length();
        //myFirst = myFirst.next;

        while (myFirst != null){
            StringStrand sa = new StringStrand(myFirst.info);
            rev.myTemp = new Node(sa.reverse().toString(), rev.myFirst);
            rev.mySize += rev.myTemp.info.length();
            rev.myFirst = rev.myTemp;
            myFirst = myFirst.next;
            //rev.myAppends++;

        }
        myFirst = n;
        return rev;
    }



    @Override
    public int getAppendCount() {
        return myAppends;
    }


    @Override

    public char charAt(int index) {

        LinkStrand o = this;


        //int count = 0; // number of nodes
        if (index < 0 || index >= o.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index<myIndex) { // be inefficient if the index given is less than the one we stored
            int count = 0;
            int dex = 0;
            Node list = myFirst;
            while (count != index) {
                count++;
                dex++;
                if (dex >= list.info.length()) {
                    dex = 0;
                    list = list.next;
                }
            }
            myCurrent = list;
            myIndex = count; // where in the whole list we are at
            myLocalIndex = dex; // where in the node we are at

            return myCurrent.info.charAt(myLocalIndex);
        }
        // while index -- increment myIndex by one
        while (myIndex != index) {
            myIndex++; // add overall index
            myLocalIndex++; // add index within the word
            if (myLocalIndex == myCurrent.info.length()) { // if the index in the word = word length
                myCurrent = myCurrent.next; // move on to the next word
                myLocalIndex=0; // reset the local index
            }
        }

        /*else {
            int diff = myCurrent.info.length() - myLocalIndex;
            int dist = index - myIndex;
            if (dist < diff) {
                if (myLocalIndex + dist > 0) {
                    return myCurrent.info.charAt(myLocalIndex + dist);
                }
            }
            else {
                while (myIndex != index && myCurrent != null) {
                    myIndex+=diff;
                    myLocalIndex=0;
                    myCurrent = myCurrent.next;
                    if (myCurrent != null && myCurrent.info.length() >= index - myIndex) {
                        myLocalIndex = index - myIndex;
                        return myCurrent.info.charAt(myLocalIndex);
                    }
                }
            }

        }
        */
        return myCurrent.info.charAt(myLocalIndex);
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node list = myFirst;
        while (list != null) {
            s.append(list.info);
            list = list.next;
        }
        return s.toString();
    }

}
