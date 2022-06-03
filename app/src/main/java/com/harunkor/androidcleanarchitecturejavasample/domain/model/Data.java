
package com.harunkor.androidcleanarchitecturejavasample.domain.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("rh")
    @Expose
    private Integer rh;
    @SerializedName("pod")
    @Expose
    private String pod;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("pres")
    @Expose
    private Double pres;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("ob_time")
    @Expose
    private String obTime;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("clouds")
    @Expose
    private Integer clouds;
    @SerializedName("ts")
    @Expose
    private Integer ts;
    @SerializedName("solar_rad")
    @Expose
    private Double solarRad;
    @SerializedName("state_code")
    @Expose
    private String stateCode;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("wind_spd")
    @Expose
    private Double windSpd;
    @SerializedName("wind_cdir_full")
    @Expose
    private String windCdirFull;
    @SerializedName("wind_cdir")
    @Expose
    private String windCdir;
    @SerializedName("slp")
    @Expose
    private Integer slp;
    @SerializedName("vis")
    @Expose
    private Integer vis;
    @SerializedName("h_angle")
    @Expose
    private Double hAngle;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("dni")
    @Expose
    private Double dni;
    @SerializedName("dewpt")
    @Expose
    private Integer dewpt;
    @SerializedName("snow")
    @Expose
    private Integer snow;
    @SerializedName("uv")
    @Expose
    private Double uv;
    @SerializedName("precip")
    @Expose
    private Integer precip;
    @SerializedName("wind_dir")
    @Expose
    private Integer windDir;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("ghi")
    @Expose
    private Double ghi;
    @SerializedName("dhi")
    @Expose
    private Double dhi;
    @SerializedName("aqi")
    @Expose
    private Integer aqi;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("weather")
    @Expose
    private Weather weather;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("temp")
    @Expose
    private Integer temp;
    @SerializedName("station")
    @Expose
    private String station;
    @SerializedName("elev_angle")
    @Expose
    private Double elevAngle;
    @SerializedName("app_temp")
    @Expose
    private Double appTemp;

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getPres() {
        return pres;
    }

    public void setPres(Double pres) {
        this.pres = pres;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public Double getSolarRad() {
        return solarRad;
    }

    public void setSolarRad(Double solarRad) {
        this.solarRad = solarRad;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public Integer getSlp() {
        return slp;
    }

    public void setSlp(Integer slp) {
        this.slp = slp;
    }

    public Integer getVis() {
        return vis;
    }

    public void setVis(Integer vis) {
        this.vis = vis;
    }

    public Double gethAngle() {
        return hAngle;
    }

    public void sethAngle(Double hAngle) {
        this.hAngle = hAngle;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Integer getDewpt() {
        return dewpt;
    }

    public void setDewpt(Integer dewpt) {
        this.dewpt = dewpt;
    }

    public Integer getSnow() {
        return snow;
    }

    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Integer getWindDir() {
        return windDir;
    }

    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Double getGhi() {
        return ghi;
    }

    public void setGhi(Double ghi) {
        this.ghi = ghi;
    }

    public Double getDhi() {
        return dhi;
    }

    public void setDhi(Double dhi) {
        this.dhi = dhi;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Double getElevAngle() {
        return elevAngle;
    }

    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    public Double getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

}
