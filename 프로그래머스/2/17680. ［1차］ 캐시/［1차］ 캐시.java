import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Cache cache = new Cache(cacheSize);

        for (String city : cities) {
            if ((cache.list).contains(city)) {
                answer += 1; // 캐시 히트 시 1
            } else {
                answer += 5; // 캐시 미스 시 5
            }
            cache.add(city);
        }

        return answer;
    }
}

class Cache {
    Deque<String> list;
    int cacheSize;

    public Cache(int cacheSize) {
        list = new ArrayDeque<>();
        this.cacheSize = cacheSize;
    }

    public void add(String element) {
        if (list.contains(element)) {
            list.remove(element);
        }
        else if (list.size() >= cacheSize) {
            list.removeFirst();
        }
        list.addLast(element);
    }
}
