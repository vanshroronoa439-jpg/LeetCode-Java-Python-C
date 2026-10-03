class Solution {
    public String convertDateToBinary(String date) {
        int y = Integer.valueOf(date.substring(0, 4)), m = Integer.valueOf(date.substring(5, 7)),
                d = Integer.valueOf(date.substring(8));
        StringBuilder sb = new StringBuilder();
        while (d > 0) {
            if (d % 2 == 0) {
                sb.insert(0,"0");
            } else {
                sb.insert(0,"1");
            }
            d /= 2;
        }
        sb.insert(0,"-");
        while (m > 0) {
            if (m % 2 == 0) {
                sb.insert(0,"0");
            } else {
                sb.insert(0,"1");
            }
            m /= 2;
        }
        sb.insert(0,"-");
        while (y > 0) {
            if (y % 2 == 0) {
                sb.insert(0,"0");
            } else {
                sb.insert(0,"1");
            }
            y /= 2;
        }
        return sb.toString();
    }
}