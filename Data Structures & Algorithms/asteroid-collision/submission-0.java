class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int curr = asteroids[i];
            boolean alive = true;

            while (alive && curr < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < -curr) {
                    st.pop();
                } 
                else if (st.peek() == -curr) {
                    st.pop();
                    alive = false;
                } 
                else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(curr);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}
