public class Domino {
    //properties
    private int top;
    private int bottom;

    //constructor
    public Domino() {
        top = 0;
        bottom = 0;
    }
    public Domino(int top1, int bottom1) {
        top = top1;
        bottom = bottom1;
    }

    //methods
    public int getTop() {
        return this.top;
    }
    public int getBottom() {
        return this.bottom;
    }
    public void setTop(int t) {
        top = t;
    }
    public void setBottom(int b) {
        bottom = b;
    }
    public String toString() {
        return top + "/" + bottom;
    }
    public void flip() {
        int otherTop = top;
        int otherBottom = bottom;
        top = otherBottom;
        bottom = otherTop;
    }
    public void settle() {
        if(top > bottom) {
            flip();
        }
    }
    public int compareTo(Domino other) {
        settle();
        other.settle();

        if (this.top < other.top) return -1;
        if (this.top > other.top) return 1;
        if (this.top == other.top) {
            if (this.bottom < other.bottom) return -1;
            if (this.bottom > other.bottom) return 1;
            if (this.bottom == other.bottom) {
                return 0;
            }
        }
        return 0;
    }
    public int compareToWeight(Domino other) {
        int selfTotal = top + bottom;
        int otherTotal = other.top + other.bottom;

        if(selfTotal < otherTotal) return -1;
        else if(otherTotal < selfTotal) return 1;
        else {
            return 0;
        }
    }
    public boolean canConnect(Domino other) {
        if(top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom) {
            return true;
        }
        else{
            return false;
        }
    }
}
