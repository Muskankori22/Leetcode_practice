class MyCalendar {
   TreeMap<Integer,Integer> map;
    public MyCalendar() {
      map = new TreeMap<>(); 
    }
    
    public boolean book(int startTime, int endTime) {
       Integer preVal = map.lowerKey(endTime);
       if(preVal!=null && startTime <= map.get(preVal)-1)
       {
        return false;
       } 
       map.put(startTime,endTime);
       return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */