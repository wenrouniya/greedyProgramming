import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
 * 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 *
 * 思想：让一艘船上进最大可能的承载两个人。
 * 将人的体重排序 让最重的和最轻的尽可能上一艘船 如果不行 最重的占用一艘船的资源
 */
public class numRescueBoats {
    public  static  int result(int [] people,int limit){
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int ans=0;
        while(i<=j){
            ans++;
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
        }
        return  ans;
    }

    public static void main(String[] args) {
        int [] people={3,5,3,4};
        int result = result(people, 8);
        System.out.println(result);
    }
}
