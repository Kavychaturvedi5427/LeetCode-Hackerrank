bool isPerfectSquare(int num) {
    int beg=1,end=num;
    while(beg<=end){
        int mid=beg+((end-beg)/2);
        long sq=(long)mid*mid;
        if(sq==num) {
            return true;
        }
        else if(sq<num){
            beg=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return false;
}