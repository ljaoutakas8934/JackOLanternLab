public class JackOLantern
{
    String [][] faceFeatures;
    public  JackOLantern (String [][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    public void fill(String str)
    {
        for(int i = 0; i < faceFeatures.length; i++)
        {
            for (int n = 0; i < faceFeatures[i].length; n++ )
            {
                faceFeatures [i][n] = str;
            }
        }
    }
    public String toString ()
    {
        String output = "";
        for (int i = 0; i < faceFeatures.length; i++)
        {
            for (int n = 0; n <faceFeatures [i].length; n++)
            {
                output = faceFeatures[i] [n] + "\n";
            }
        }
        return output;
    }
    public void edit (String replace, int row, int column)
    {
        faceFeatures [row] [column] = replace;
    }


}
