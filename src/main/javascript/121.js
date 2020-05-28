/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(P) {
    var minprice = Infinity;
    var maxprofit = 0;

    for(var i = 0; i < P.length; i++) {
        if(P[i] < minprice) {
            minprice = P[i];
        } else if(P[i] - minprice > maxprofit) {
            maxprofit = P[i] - minprice;
        }
    }

    return maxprofit;
};
