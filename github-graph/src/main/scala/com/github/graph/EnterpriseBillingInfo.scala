package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object EnterpriseBillingInfo {

  /** The number of licenseable users/emails across the enterprise.
    */
  def allLicensableUsersCount: SelectionBuilder[EnterpriseBillingInfo, Int] =
    _root_.caliban.client.SelectionBuilder.Field("allLicensableUsersCount", Scalar())

  /** The number of data packs used by all organizations owned by the enterprise.
    */
  def assetPacks: SelectionBuilder[EnterpriseBillingInfo, Int] = _root_.caliban.client.SelectionBuilder.Field("assetPacks", Scalar())

  /** The number of available seats across all owned organizations based on the unique number of billable users.
    */
  @deprecated(
    "`availableSeats` will be replaced with `totalAvailableLicenses` to provide more clarity on the value being returned Use EnterpriseBillingInfo.totalAvailableLicenses instead. Removal on 2020-01-01 UTC.",
    ""
  )
  def availableSeats: SelectionBuilder[EnterpriseBillingInfo, Int] = _root_.caliban.client.SelectionBuilder.Field("availableSeats", Scalar())

  /** The bandwidth quota in GB for all organizations owned by the enterprise.
    */
  def bandwidthQuota: SelectionBuilder[EnterpriseBillingInfo, Double] = _root_.caliban.client.SelectionBuilder.Field("bandwidthQuota", Scalar())

  /** The bandwidth usage in GB for all organizations owned by the enterprise.
    */
  def bandwidthUsage: SelectionBuilder[EnterpriseBillingInfo, Double] = _root_.caliban.client.SelectionBuilder.Field("bandwidthUsage", Scalar())

  /** The bandwidth usage as a percentage of the bandwidth quota.
    */
  def bandwidthUsagePercentage: SelectionBuilder[EnterpriseBillingInfo, Int] =
    _root_.caliban.client.SelectionBuilder.Field("bandwidthUsagePercentage", Scalar())

  /** The total seats across all organizations owned by the enterprise.
    */
  @deprecated(
    "`seats` will be replaced with `totalLicenses` to provide more clarity on the value being returned Use EnterpriseBillingInfo.totalLicenses instead. Removal on 2020-01-01 UTC.",
    ""
  )
  def seats: SelectionBuilder[EnterpriseBillingInfo, Int] = _root_.caliban.client.SelectionBuilder.Field("seats", Scalar())

  /** The storage quota in GB for all organizations owned by the enterprise.
    */
  def storageQuota: SelectionBuilder[EnterpriseBillingInfo, Double] = _root_.caliban.client.SelectionBuilder.Field("storageQuota", Scalar())

  /** The storage usage in GB for all organizations owned by the enterprise.
    */
  def storageUsage: SelectionBuilder[EnterpriseBillingInfo, Double] = _root_.caliban.client.SelectionBuilder.Field("storageUsage", Scalar())

  /** The storage usage as a percentage of the storage quota.
    */
  def storageUsagePercentage: SelectionBuilder[EnterpriseBillingInfo, Int] =
    _root_.caliban.client.SelectionBuilder.Field("storageUsagePercentage", Scalar())

  /** The number of available licenses across all owned organizations based on the unique number of billable users.
    */
  def totalAvailableLicenses: SelectionBuilder[EnterpriseBillingInfo, Int] =
    _root_.caliban.client.SelectionBuilder.Field("totalAvailableLicenses", Scalar())

  /** The total number of licenses allocated.
    */
  def totalLicenses: SelectionBuilder[EnterpriseBillingInfo, Int] = _root_.caliban.client.SelectionBuilder.Field("totalLicenses", Scalar())
}

