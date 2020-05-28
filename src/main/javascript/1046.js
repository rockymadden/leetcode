/**
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function(stones) {
    var x;
    var y;

    for(var i = 0; stones.length > 1; i++) {
        stones.sort((a, b) => a > b);

        y = stones.pop();
        x = stones.pop();

        if(x !== y) {
            y -= x;
            stones.push(y);
        }
    }

    return stones[0] || 0;
};
