package com.ajit123jain.employee.api;

import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by ajit on 4/11/17.
 */

interface APIInterface {

    @POST("/EmployeeApi/v1/Api.php?apicall=createemployee")
    Call<JsonObject> createEmployee(@QueryMap Map<String, String> options);

    @POST("/EmployeeApi/v1/Api.php?apicall=updateemployee")
    Call<JsonObject> updateEmployee(@QueryMap Map<String, String> options);

    @GET("/EmployeeApi/v1/Api.php?apicall=getemployee")
    Call<JsonObject> getEmployee();

    @GET("/EmployeeApi/v1/Api.php?apicall=searhemployee")
    Call<JsonObject> searchEmployee();

    @GET("/EmployeeApi/v1/Api.php?apicall=deleteemployee")
    Call<JsonObject> deleteEmployee(@Field("prefix") String prefix) ;

}