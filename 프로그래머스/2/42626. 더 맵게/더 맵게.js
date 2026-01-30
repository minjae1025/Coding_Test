function solution(scoville, K) {
    var cnt = 0;
    let idx1 = 0;
    let idx2 = 0;
    scoville.sort((a, b) => a - b);
    const newScoville = [];
    
    const findMin = () => {
        const original_min = scoville[idx1]
        const new_min = newScoville[idx2]

        if (original_min === undefined) return newScoville[idx2++];
        if (new_min === undefined) return scoville[idx1++];
        return new_min < original_min ? newScoville[idx2++] : scoville[idx1++];
    }
    
    while(scoville.length - idx1 + newScoville.length - idx2 > 0){

        const min1 = findMin()
        if (min1 >= K) return cnt

        const min2 = findMin()
        if(min2 === undefined) return -1

        const mix = min1+min2*2
        newScoville.push(mix)
        cnt++
    }
}