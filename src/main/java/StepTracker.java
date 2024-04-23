import java.util.ArrayList;
public class StepTracker
{
 private int leastSteps;
 private int totalSteps;
 private int totalActiveDays;
 private int totalDays;
 public StepTracker(int steps){
  totalSteps = 0;
  totalActiveDays = 0;
  totalDays = 0;
  leastSteps = steps;
 }
 public void addDailySteps(int steps){
  if(steps >= leastSteps){
   totalActiveDays+=1;
  }
  totalDays+=1;
  totalSteps+=steps;
 }
 public int activeDays(){
  return totalActiveDays;
 }
 public double averageSteps(){
  if(totalDays == 0)
   return 0;
  return totalSteps/(double)totalDays;
 }
} 
