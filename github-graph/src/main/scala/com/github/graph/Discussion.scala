package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Discussion {

  /** Reason that the conversation was locked.
    */
  def activeLockReason: SelectionBuilder[Discussion, Option[LockReason]] =
    _root_.caliban.client.SelectionBuilder.Field("activeLockReason", OptionOf(Scalar()))

  /** The comment chosen as this discussion's answer, if any.
    */
  def answer[A](innerSelection: SelectionBuilder[DiscussionComment, A]): SelectionBuilder[Discussion, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field("answer", OptionOf(Obj(innerSelection)))

  /** The time when a user chose this discussion's answer, if answered.
    */
  def answerChosenAt: SelectionBuilder[Discussion, Option[DateTime]] =
    _root_.caliban.client.SelectionBuilder.Field("answerChosenAt", OptionOf(Scalar()))

  /** The user who chose this discussion's answer, if answered.
    */
  def answerChosenBy[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Discussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "answerChosenBy",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** The actor who authored the comment.
    */
  def author[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Discussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "author",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )

  /** Author's association with the subject of the comment.
    */
  def authorAssociation: SelectionBuilder[Discussion, CommentAuthorAssociation] =
    _root_.caliban.client.SelectionBuilder.Field("authorAssociation", Scalar())

  /** The main text of the discussion post.
    */
  def body: SelectionBuilder[Discussion, String] = _root_.caliban.client.SelectionBuilder.Field("body", Scalar())

  /** The body rendered to HTML.
    */
  def bodyHTML: SelectionBuilder[Discussion, HTML] = _root_.caliban.client.SelectionBuilder.Field("bodyHTML", Scalar())

  /** The body rendered to text.
    */
  def bodyText: SelectionBuilder[Discussion, String] = _root_.caliban.client.SelectionBuilder.Field("bodyText", Scalar())

  /** The category for this discussion.
    */
  def category[A](innerSelection: SelectionBuilder[DiscussionCategory, A]): SelectionBuilder[Discussion, A] =
    _root_.caliban.client.SelectionBuilder.Field("category", Obj(innerSelection))

  /** The replies to the discussion.
    */
  def comments[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[DiscussionCommentConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Discussion, A] = _root_.caliban.client.SelectionBuilder.Field(
    "comments",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Identifies the date and time when the object was created.
    */
  def createdAt: SelectionBuilder[Discussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("createdAt", Scalar())

  /** Check if this comment was created via an email reply.
    */
  def createdViaEmail: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("createdViaEmail", Scalar())

  /** Identifies the primary key from the database.
    */
  def databaseId: SelectionBuilder[Discussion, Option[Int]] = _root_.caliban.client.SelectionBuilder.Field("databaseId", OptionOf(Scalar()))

  /** The actor who edited the comment.
    */
  def editor[A](
    onBot: Option[SelectionBuilder[Bot, A]]                                     = None,
    onEnterpriseUserAccount: Option[SelectionBuilder[EnterpriseUserAccount, A]] = None,
    onMannequin: Option[SelectionBuilder[Mannequin, A]]                         = None,
    onOrganization: Option[SelectionBuilder[Organization, A]]                   = None,
    onUser: Option[SelectionBuilder[User, A]]                                   = None
  ): SelectionBuilder[Discussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "editor",
    OptionOf(
      ChoiceOf(
        Map(
          "Bot"                   -> onBot,
          "EnterpriseUserAccount" -> onEnterpriseUserAccount,
          "Mannequin"             -> onMannequin,
          "Organization"          -> onOrganization,
          "User"                  -> onUser
        ).collect { case (k, Some(v)) => k -> Obj(v) }
      )
    )
  )
  def id: SelectionBuilder[Discussion, String] = _root_.caliban.client.SelectionBuilder.Field("id", Scalar())

  /** Check if this comment was edited and includes an edit with the creation data
    */
  def includesCreatedEdit: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("includesCreatedEdit", Scalar())

  /** A list of labels associated with the object.
    */
  def labels[A](
    after: Option[String]       = None,
    before: Option[String]      = None,
    first: Option[Int]          = None,
    last: Option[Int]           = None,
    orderBy: Option[LabelOrder] = None
  )(innerSelection: SelectionBuilder[LabelConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[LabelOrder]]
  ): SelectionBuilder[Discussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "labels",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3),
      Argument("orderBy", orderBy, "LabelOrder")(encoder4)
    )
  )

  /** The moment the editor made the last edit
    */
  def lastEditedAt: SelectionBuilder[Discussion, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("lastEditedAt", OptionOf(Scalar()))

  /** `true` if the object is locked
    */
  def locked: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("locked", Scalar())

  /** The number identifying this discussion within the repository.
    */
  def number: SelectionBuilder[Discussion, Int] = _root_.caliban.client.SelectionBuilder.Field("number", Scalar())

  /** Identifies when the comment was published at.
    */
  def publishedAt: SelectionBuilder[Discussion, Option[DateTime]] = _root_.caliban.client.SelectionBuilder.Field("publishedAt", OptionOf(Scalar()))

  /** A list of reactions grouped by content left on the subject.
    */
  def reactionGroups[A](innerSelection: SelectionBuilder[ReactionGroup, A]): SelectionBuilder[Discussion, Option[List[A]]] =
    _root_.caliban.client.SelectionBuilder.Field("reactionGroups", OptionOf(ListOf(Obj(innerSelection))))

  /** A list of Reactions left on the Issue.
    */
  def reactions[A](
    after: Option[String]            = None,
    before: Option[String]           = None,
    content: Option[ReactionContent] = None,
    first: Option[Int]               = None,
    last: Option[Int]                = None,
    orderBy: Option[ReactionOrder]   = None
  )(innerSelection: SelectionBuilder[ReactionConnection, A])(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[ReactionContent]],
    encoder3: ArgEncoder[Option[Int]],
    encoder4: ArgEncoder[Option[Int]],
    encoder5: ArgEncoder[Option[ReactionOrder]]
  ): SelectionBuilder[Discussion, A] = _root_.caliban.client.SelectionBuilder.Field(
    "reactions",
    Obj(innerSelection),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("content", content, "ReactionContent")(encoder2),
      Argument("first", first, "Int")(encoder3),
      Argument("last", last, "Int")(encoder4),
      Argument("orderBy", orderBy, "ReactionOrder")(encoder5)
    )
  )

  /** The repository associated with this node.
    */
  def repository[A](innerSelection: SelectionBuilder[Repository, A]): SelectionBuilder[Discussion, A] =
    _root_.caliban.client.SelectionBuilder.Field("repository", Obj(innerSelection))

  /** The path for this discussion.
    */
  def resourcePath: SelectionBuilder[Discussion, URI] = _root_.caliban.client.SelectionBuilder.Field("resourcePath", Scalar())

  /** The title of this discussion.
    */
  def title: SelectionBuilder[Discussion, String] = _root_.caliban.client.SelectionBuilder.Field("title", Scalar())

  /** Identifies the date and time when the object was last updated.
    */
  def updatedAt: SelectionBuilder[Discussion, DateTime] = _root_.caliban.client.SelectionBuilder.Field("updatedAt", Scalar())

  /** Number of upvotes that this subject has received.
    */
  def upvoteCount: SelectionBuilder[Discussion, Int] = _root_.caliban.client.SelectionBuilder.Field("upvoteCount", Scalar())

  /** The URL for this discussion.
    */
  def url: SelectionBuilder[Discussion, URI] = _root_.caliban.client.SelectionBuilder.Field("url", Scalar())

  /** A list of edits to this content.
    */
  def userContentEdits[A](after: Option[String] = None, before: Option[String] = None, first: Option[Int] = None, last: Option[Int] = None)(
    innerSelection: SelectionBuilder[UserContentEditConnection, A]
  )(implicit
    encoder0: ArgEncoder[Option[String]],
    encoder1: ArgEncoder[Option[String]],
    encoder2: ArgEncoder[Option[Int]],
    encoder3: ArgEncoder[Option[Int]]
  ): SelectionBuilder[Discussion, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "userContentEdits",
    OptionOf(Obj(innerSelection)),
    arguments = List(
      Argument("after", after, "String")(encoder0),
      Argument("before", before, "String")(encoder1),
      Argument("first", first, "Int")(encoder2),
      Argument("last", last, "Int")(encoder3)
    )
  )

  /** Check if the current viewer can delete this object.
    */
  def viewerCanDelete: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanDelete", Scalar())

  /** Can user react to this subject
    */
  def viewerCanReact: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanReact", Scalar())

  /** Check if the viewer is able to change their subscription status for the repository.
    */
  def viewerCanSubscribe: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanSubscribe", Scalar())

  /** Check if the current viewer can update this object.
    */
  def viewerCanUpdate: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpdate", Scalar())

  /** Whether or not the current user can add or remove an upvote on this subject.
    */
  def viewerCanUpvote: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerCanUpvote", Scalar())

  /** Did the viewer author this comment.
    */
  def viewerDidAuthor: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerDidAuthor", Scalar())

  /** Whether or not the current user has already upvoted this subject.
    */
  def viewerHasUpvoted: SelectionBuilder[Discussion, Boolean] = _root_.caliban.client.SelectionBuilder.Field("viewerHasUpvoted", Scalar())

  /** Identifies if the viewer is watching, not watching, or ignoring the subscribable entity.
    */
  def viewerSubscription: SelectionBuilder[Discussion, Option[SubscriptionState]] =
    _root_.caliban.client.SelectionBuilder.Field("viewerSubscription", OptionOf(Scalar()))
}

