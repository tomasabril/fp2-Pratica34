/*
 * MPL
 */

/**
 *
 * @author tomas
 */
public class Pratica34
{
    public static long mdc(long m, long n) {
        if(n>m) {
            return mdc(n,m);
        }
        if(n==0) {
            return m;
        }
        if(n>0) {
            return mdc(n, (m%n) );
        }
        return -1;
    }
    
    public static long fatorial(long n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return ( fatorial(n-1)*n );
        }
    }
}

/*
mdc(m, n) = mdc(n, m), se n > m
mdc(m, n) = m, se n = 0
mdc(m, n) = mdc(n, resto da divisão de m por n), se n > 0
*/