package com.microservice.user.domain.model.user;

import com.microservice.user.domain.model.Entity;

public class User implements Entity {
    //-----------------
    // フィールド
    //-----------------
    private UserId id; // 識別子は値オブジェクトとして定義
    private Name name;
    private Password password;
    //-----------------
    // コンストラクタ
    //-----------------
    public User(UserId id,Name name,Password password) {
        if(id == null) throw new IllegalArgumentException("IDは必須");
        if(name == null) throw new IllegalArgumentException("名前は必須");
        if(password == null) throw new IllegalArgumentException("パスワードは必須");
        this.id = id;
        this.name = name;
        this.password = password;
    }
    //-----------------
    // ゲッター
    //-----------------
    public UserId id() { return id; }
    public Name name(){ return name; }
    public Password password(){ return password; }
    //-----------------
    // 等価性
    //-----------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User other = (User)obj;
        return this.id.value().equals(other.id().value());
    }
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    //----------------
    // インスタンス出力
    //----------------
    @Override
    public String toString() {
        return String.format(
                "User[id=%s,name=%s,password=%s]",
                this.id(),
                this.name(),
                this.password()
        );
    }
}
