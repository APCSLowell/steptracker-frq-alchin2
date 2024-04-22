import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, aDays,total;
 private ArrayList<Integer>hi;
 public StepTracker (int s){
  minSteps = s;
  aDays = 0;
  hi = new ArrayList<Integer>();
} 
 public void addDailySteps(int s){
  if(s>minSteps){
   aDays++;
   hi.add(s);
  }
 }
 public int activeDays(){
  return aDays;
 }
 public double averageSteps(){
  total=0;
  for(int i = 0; i < hi.size();i++){
   total += hi.get(i);
  }
  return (double)total/(double)hi.size();
  }
 }
