class MediumIncrementQuestion {
    public static void main(String[] args) {
        int a = 5, b = 3, c = -1, d = 0, e = -5;
        int res = ((--c) - (a--) + (++e) + (--b) - (d--) + (++d) - (a++) + (++b) + (c++) - (b--) + (--a));
        System.out.println("a: " + a + "\nb:" +  " " + b + "\nc:" + " " + c + "\nd:" + " " + d + "\ne:" + " " + e);
        System.out.println("result: " + res);
    }
}