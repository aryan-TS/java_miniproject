public class StopwatchImpl implements StopwatchInterface 
{ 
private long startTime; 
private long elapsedTime; 
private boolean running; 
public void start() 
{ 
if (!running) 
{ 
startTime = System.currentTimeMillis();
 running = true;
 }
 } 
public void stop()
 { 
if (running)
 {
 elapsedTime += System.currentTimeMillis() - startTime; running = false; 
}
 } 
public void reset() 
{ 
startTime = 0; 
elapsedTime = 0; 
running = false; 
} 
public long getElapsedTime()
{
 if (running)
 {
 return elapsedTime + System.currentTimeMillis() - startTime;
 } 
 else 
 { 
return elapsedTime;
 }
 } 
}
