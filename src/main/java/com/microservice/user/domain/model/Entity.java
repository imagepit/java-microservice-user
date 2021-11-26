package com.microservice.user.domain.model;
/**
 * エンティティとは
 * ドメイン上大事な概念で
 * - 識別子をもつ
 * - ライフサイクルを管理したい（状態変化がある）
 * - 例
 *   - ヒト（顧客、社員etc）
 *   - モノ（商品、サービスetc）
 *   - カネ（注文、契約、予約etc）
 * - 等価性
 *   - 識別子は等しいかどうか
 */
public interface Entity {
    boolean equals(Object that);
    int hashCode();
}
