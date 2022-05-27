/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gate.gateapi.models.FuturesAccount;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubAccountFuturesBalance
 */
public class SubAccountFuturesBalance {
    public static final String SERIALIZED_NAME_UID = "uid";
    @SerializedName(SERIALIZED_NAME_UID)
    private String uid;

    public static final String SERIALIZED_NAME_AVAILABLE = "available";
    @SerializedName(SERIALIZED_NAME_AVAILABLE)
    private Map<String, FuturesAccount> available = null;


    public SubAccountFuturesBalance uid(String uid) {
        
        this.uid = uid;
        return this;
    }

     /**
     * User ID
     * @return uid
    **/
    @javax.annotation.Nullable
    public String getUid() {
        return uid;
    }


    public void setUid(String uid) {
        this.uid = uid;
    }

    public SubAccountFuturesBalance available(Map<String, FuturesAccount> available) {
        
        this.available = available;
        return this;
    }

    public SubAccountFuturesBalance putAvailableItem(String key, FuturesAccount availableItem) {
        if (this.available == null) {
            this.available = new HashMap<>();
        }
        this.available.put(key, availableItem);
        return this;
    }

     /**
     * Futures account balances
     * @return available
    **/
    @javax.annotation.Nullable
    public Map<String, FuturesAccount> getAvailable() {
        return available;
    }


    public void setAvailable(Map<String, FuturesAccount> available) {
        this.available = available;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubAccountFuturesBalance subAccountFuturesBalance = (SubAccountFuturesBalance) o;
        return Objects.equals(this.uid, subAccountFuturesBalance.uid) &&
                Objects.equals(this.available, subAccountFuturesBalance.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, available);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubAccountFuturesBalance {\n");
        sb.append("      uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("      available: ").append(toIndentedString(available)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n        ");
    }

}

