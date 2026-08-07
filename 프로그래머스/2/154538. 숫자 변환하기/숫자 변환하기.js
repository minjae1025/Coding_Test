function solution(x, y, n) {
    if (x === y) return 0;

    let set = new Set([x]);
    let count = 0;

    while (set.size > 0) {
        count++;
        const nextSet = new Set();

        for (const current of set) {
            for (const next of [current + n, current * 2, current * 3]) {
                if (next === y) return count;
                if (next < y) nextSet.add(next);
            }
        }
        set = nextSet;
    }

    return -1;
}
