import java.util.ArrayList;
public class StepTracker
{
 private final int leastSteps;
 private double totalSteps;
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
  return totalSteps/totalDays;
 }
} 
