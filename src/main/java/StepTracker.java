import java.util.ArrayList;
public class StepTracker
{
 private double totalSteps;
 private int totalActiveDays;
 private int totalDays;
 public StepTracker(){
  totalSteps = 0;
  totalActiveDays = 0;
  totalDays = 0;
 }
 public void addDailySteps(int steps){
  if(steps >= 10,000){
   totalActiveDays+=1;
   totalDays+=1;
  }
  totalDays+=1;
 }
 public int activeDays(){
  return totalActiveDays;
 }
 public double averageSteps(){
  return totalSteps/totalDays;
 }
} 
