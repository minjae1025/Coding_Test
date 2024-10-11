public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int maxHealth = health;
        int now_time = 0;
        int success_time = 0;

        for (int i = 0; i < attacks.length; i++) {
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];

            while (now_time < attackTime) {
                health = Math.min(health + x, maxHealth);
                success_time++;
                now_time++;

                if (success_time == t) {
                    health = Math.min(health + y, maxHealth);
                    success_time = 0;
                }

                if (health <= 0) {
                    return -1;
                }
            }

            health -= damage;
            success_time = 0;
            now_time++;

            if (health <= 0) {
                return -1;
            }
        }

        return health;
    }
}
