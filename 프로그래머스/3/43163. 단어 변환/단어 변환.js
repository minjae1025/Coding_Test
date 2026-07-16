function solution(begin, target, words) {
    var answer = 0;

    let use_list = new Set([begin]);
    let queue = [[begin, 0]];


    while (queue.length > 0) {
        let [current, count] = queue.shift();
        // console.log("current", current, count);
        if (current === target) {
            answer = count;
            break;
        }

        words.forEach((item, idx) => {
            if (current !== item && isChange(current, item) && !use_list.has(item)) {
                // console.log("change", current, item);
                use_list.add(item);
                queue.push([item, count + 1]);
            }
        });
        // console.log("queue", queue);
    }

    return answer;
}

function isChange(before_word, after_word) {
    let different_count = 0
    const before_array = Array.from(before_word);
    const after_array = Array.from(after_word);
    for (let i = 0; i < before_array.length; i++) {
        if (before_array[i] !== after_array[i]) {
            different_count++;
        }
    }
    return different_count === 1 ? true : false;
}