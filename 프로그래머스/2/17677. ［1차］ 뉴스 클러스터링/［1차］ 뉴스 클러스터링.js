function solution(str1, str2) {
    var answer = 0;

    let str1_set = [];
    let str2_set = [];

    for (let i = 0; i < str1.length - 1; i++) {
        const temp = str1[i] + str1[i + 1];
        if (/^[a-zA-Z]+$/.test(temp)) {
            str1_set.push(temp.toLowerCase());
        }
    }

    for (let i = 0; i < str2.length - 1; i++) {
        const temp = str2[i] + str2[i + 1];
        if (/^[a-zA-Z]+$/.test(temp)) {
            str2_set.push(temp.toLowerCase());
        }
    }

    console.log(`str1_set: ${str1_set}`);
    console.log(`str2_set: ${str2_set}`);

    const str1_dict = {};
    const str2_dict = {};

    for (const item of str1_set) {
        str1_dict[item] = (str1_dict[item] || 0) + 1;
    }

    for (const item of str2_set) {
        str2_dict[item] = (str2_dict[item] || 0) + 1;
    }

    const intersection = [];
    for (const key in str1_dict) {
        if (str2_dict[key]) {
            const count = Math.min(str1_dict[key], str2_dict[key]);
            for (let i = 0; i < count; i++) {
                intersection.push(key);
            }
        }
    }

    const union = [];
    for (const key in str1_dict) {
        const count = Math.max(str1_dict[key], str2_dict[key] || 0);
        for (let i = 0; i < count; i++) {
            union.push(key);
        }
    }
    for (const key in str2_dict) {
        if (!str1_dict[key]) {
            const count = str2_dict[key];
            for (let i = 0; i < count; i++) {
                union.push(key);
            }
        }
    }

    const jaccard = intersection.length === 0 && union.length === 0 ? 1 : intersection.length / union.length;
    answer = Math.floor(jaccard * 65536);
    return answer;
}