class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].matches("-?\\d+")) {
                stack.push(Integer.valueOf(operations[i]));
            }
            if (operations[i].equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            if (operations[i].equals("D")) {
                if (!stack.isEmpty()) {
                    int value = stack.peek();
                    stack.push(value * 2);
                }
            }
            if (operations[i].equals("+")) {
                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.peek();
                    stack.push(a);
                    stack.push(a + b);
                }
            }
        }
        int res =0;
        for(int x:stack){
            res+=x;
        }
        return res;
    }
}