class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean one;
        boolean two;
        if (x1 || x2) {
            one = true;
        }
        else {
            one = false;
        }
        if (x3 || x4) {
            two = true;
        }
        else {
            two = false;
        }
        if (!one || !two) {
            return false;
        }
        else {
            return true;
        }
    }
}