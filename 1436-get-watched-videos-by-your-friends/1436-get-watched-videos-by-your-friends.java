class Solution {
    class Pair implements Comparable<Pair>{
        String video;
        int freq;
        Pair(String video,int freq){
            this.video = video;
            this.freq = freq;
        }
        public int compareTo(Pair that)
        {
            if(this.freq == that.freq)
            {
                return this.video.compareTo(that.video);
            }
            return this.freq - that.freq;
        }
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
       Queue<Integer> qu = new LinkedList<>();
       HashSet<Integer> visited = new HashSet<>();
       int currlevel = 0;
       qu.offer(id);
       visited.add(id);
       while(!qu.isEmpty())
       {
        int size = qu.size();
        for(int i=0;i<size;i++)
        {
            int currid = qu.poll();
            for(int friend : friends[currid])
            {
                if(!visited.contains(friend))
                {
                    visited.add(friend);
                    qu.offer(friend);
                }
            }
        }
        currlevel++;
        if(currlevel == level)
        {
            break;
        }
       }
       HashMap<String,Integer> map = new HashMap<>();
       while(!qu.isEmpty())
       {
        int currid = qu.poll();
        for(String video:watchedVideos.get(currid))
        {
            map.put(video,map.getOrDefault(video,0)+1);
        }
       }
       List<Pair> videoList = new ArrayList<>();
       for(String video : map.keySet())
       {
        videoList.add(new Pair(video,map.get(video)));
       }
       Collections.sort(videoList);
       List<String> res = new ArrayList<>();
       for(Pair pair : videoList)
       {
        res.add(pair.video);
       }
       return res;
    }
}