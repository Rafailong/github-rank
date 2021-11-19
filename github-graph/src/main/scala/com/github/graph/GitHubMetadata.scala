package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object GitHubMetadata {

  /** Returns a String that's a SHA of `github-services`
    */
  def gitHubServicesSha: SelectionBuilder[GitHubMetadata, GitObjectID] = _root_.caliban.client.SelectionBuilder.Field("gitHubServicesSha", Scalar())

  /** IP addresses that users connect to for git operations
    */
  def gitIpAddresses: SelectionBuilder[GitHubMetadata, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("gitIpAddresses", OptionOf(ListOf(Scalar())))

  /** IP addresses that service hooks are sent from
    */
  def hookIpAddresses: SelectionBuilder[GitHubMetadata, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("hookIpAddresses", OptionOf(ListOf(Scalar())))

  /** IP addresses that the importer connects from
    */
  def importerIpAddresses: SelectionBuilder[GitHubMetadata, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("importerIpAddresses", OptionOf(ListOf(Scalar())))

  /** Whether or not users are verified
    */
  def isPasswordAuthenticationVerifiable: SelectionBuilder[GitHubMetadata, Boolean] =
    _root_.caliban.client.SelectionBuilder.Field("isPasswordAuthenticationVerifiable", Scalar())

  /** IP addresses for GitHub Pages' A records
    */
  def pagesIpAddresses: SelectionBuilder[GitHubMetadata, Option[List[String]]] =
    _root_.caliban.client.SelectionBuilder.Field("pagesIpAddresses", OptionOf(ListOf(Scalar())))
}

