package android.fatherweather.com.fatherweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by thinkpad on 2017/5/6.
 */

public class City extends DataSupport{
    private int id;
    private String cityNmae;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityNmae(){
        return  cityNmae;
    }
    public void setCityNmae(String cityNmae){
        this.cityNmae=cityNmae;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
