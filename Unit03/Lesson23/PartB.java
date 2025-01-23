/*
 * Juan
 * 1/23/25
 * The output of this code:
 * public static int getInt() {
 * try {
 * return 1;
 * } catch (Exception e) {
 * return 2;
 * } finally {
 * return 3;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println(getInt());
 * }
 * 
 * is 3
 * this is because In the getInt() method, the finally block always executes,
 * and if it contains a return statement, it overrides any return value from the
 * try or catch blocks. Even though the try block attempts to return 1, the
 * method ultimately returns 3 because the finally block’s return 3; takes
 * precedence. So, the output is 3.
 */