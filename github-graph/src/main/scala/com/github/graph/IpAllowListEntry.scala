package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object IpAllowListEntry {

  /** A single IP address or range of IP addresses in CIDR notation.
    */
  def allowListValue: SelectionBuilder[IpAllowListEntry, String] = _root_.caliban.client.SelectionBuilder.Field("allowListValue", Scalar())

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[IpAllowListEntry, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())
  def id: SelectionBuilder[IpAllowListEntry, String]          = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Whether the entry is currently active.
    */
  def isActive: SelectionBuilder[IpAllowListEntry, Boolean] = _root_.caliban.client.SelectionBuilder.Field("isActive", Scalar())

  /** The name of the IP allow list entry.
    */
  def name: SelectionBuilder[IpAllowListEntry, Option[String]] = _root_.caliban.client.SelectionBuilder.Field("name", OptionOf(Scalar()))

  /** The owner of the IP allow list entry.
    */
  def owner[A](
    onApp: SelectionBuilder[App, A],
    onEnterprise: SelectionBuilder[Enterprise, A],
    onOrganization: SelectionBuilder[Organization, A]
  ): SelectionBuilder[IpAllowListEntry, A] = _root_.caliban.client.SelectionBuilder
    .Field("owner", ChoiceOf(Map("App" -> Obj(onApp), "Enterprise" -> Obj(onEnterprise), "Organization" -> Obj(onOrganization))))

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[IpAllowListEntry, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())
}

