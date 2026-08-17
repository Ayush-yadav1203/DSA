class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++){
            
            int range=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(range<=drones[i][2] && range<min){
                min=range;
                index=i;
            }
        }
        return index;
    }
}