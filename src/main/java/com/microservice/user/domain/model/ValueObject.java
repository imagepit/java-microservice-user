package com.microservice.user.domain.model;
/**
 * 値オブジェクトとは
 * ドメイン上大事な概念
 * - 識別子は不要
 * - 不変性（イミュータブル）
 *  - 値オブジェクトの値を変更する場合は
 *  - 変更後の新しいオブジェクトを生成して
 *  - 差し替える！
 *   -> スレッドセーフ
 * - エンティティの属性を表現するもの
 * - 例
 *   - 名前、性別、生年月日
 *   - 位置情報、お金、ポイントetc
 * - 等価性
 *   - 全ての属性が等しいかどうか
 */
public interface ValueObject {
    boolean equals(Object that);
    int hashCode();
}
