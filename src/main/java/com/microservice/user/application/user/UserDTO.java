package com.microservice.user.application.user;

import java.io.Serializable;

/**
 * UserDTO
 * - APIとしてJSONとして外部に渡すデータモデル
 * - ドメインモデル（User）のモデルをJSON化するのはNG!!
 *   - ドメインモデルをAPIのデータモデルとしてしまうとAPI部分に引きずられることになるため
 */
public class UserDTO
        implements Serializable
{
    //---------------------
    // フィールド
    //---------------------
    private String id;
    private String name;
    private String password;
    //---------------------
    // ゲッター・セッター
    //---------------------
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
