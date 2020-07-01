/**
 * 罗马数字包含以下七种字符：I， V， X，L，C，D 和 M。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，
 * 例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
 * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。
 * 这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 *
 * 思路：找出有特殊样式的字符 如 1，4，9，10....
 * 将给定的数字从这些数字中拼凑出来 就是贪心的思想
 */
public class intToRoman {

    public  static  String result(int num){
        StringBuilder res=new StringBuilder();
        int [] nums={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
         int index=0;
         while(index<13){
             if(num>nums[index]){
                 res.append(romans[index]);
                 num-=nums[index];
             }else {
                 index++;
             }
         }
        return  res.toString();
    }

    public static void main(String[] args) {
        String result = result(2834);
        System.out.println(result);
    }
}
