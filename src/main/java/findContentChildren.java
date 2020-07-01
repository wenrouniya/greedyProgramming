import java.util.Arrays;

/**
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干但是，每个孩子最多只能给一块饼干
 * 对每个孩子 i ，都有一个胃口值 gi ，
 * 这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，
 * 都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i
 * ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 * 注意：你可以假设胃口值为正。一个小朋友最多只能拥有一块饼干。
 * 示例 :
 * 输入: [1,2,3], [1,1]
 * 解释: 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。虽然你有两块小饼干，由于他们的尺寸都是1
 * ，你只能让胃口值是1的孩子满足。所以你应该输出1。
 *
 * 思路：
 * 同时让胃口和饼干排好序 从小到大
 * 如果最小的饼干能满足最小的胃口 就给他吃 如果不能就放弃饼干继续向后遍历
 * 要同时控制胃口和饼干 所以需要双指针
 * 从小到大排列同理
 */
public class findContentChildren {

    public  static  int result(int [] GI,int [] SJ){

        if(GI==null ||SJ ==null){
            return  0;
        }
        Arrays.sort(GI);
        Arrays.sort(SJ);

        int i=0;
        int j=0;
       while (i<GI.length&& j<SJ.length){
            if(SJ[j]>=GI[i]){//饼干够吃 人才向后移动 饼干不够吃 人不移动 饼干指针向后移动
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] gi={1,2,3};
        int [] si={1,1};
        int result = result(gi, si);
        System.out.println(result);
    }
}
