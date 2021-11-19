package com.github.graph

import caliban.client.FieldBuilder._
import caliban.client._

object Mutation {

  /** Accepts a pending invitation for a user to become an administrator of an enterprise.
    */
  def acceptEnterpriseAdministratorInvitation[A](
    input: AcceptEnterpriseAdministratorInvitationInput
  )(innerSelection: SelectionBuilder[AcceptEnterpriseAdministratorInvitationPayload, A])(implicit
    encoder0: ArgEncoder[AcceptEnterpriseAdministratorInvitationInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "acceptEnterpriseAdministratorInvitation",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "AcceptEnterpriseAdministratorInvitationInput!")(encoder0))
  )

  /** Applies a suggested topic to the repository.
    */
  def acceptTopicSuggestion[A](input: AcceptTopicSuggestionInput)(innerSelection: SelectionBuilder[AcceptTopicSuggestionPayload, A])(implicit
    encoder0: ArgEncoder[AcceptTopicSuggestionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "acceptTopicSuggestion",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "AcceptTopicSuggestionInput!")(encoder0))
  )

  /** Adds assignees to an assignable object.
    */
  def addAssigneesToAssignable[A](input: AddAssigneesToAssignableInput)(innerSelection: SelectionBuilder[AddAssigneesToAssignablePayload, A])(implicit
    encoder0: ArgEncoder[AddAssigneesToAssignableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "addAssigneesToAssignable",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "AddAssigneesToAssignableInput!")(encoder0))
  )

  /** Adds a comment to an Issue or Pull Request.
    */
  def addComment[A](input: AddCommentInput)(innerSelection: SelectionBuilder[AddCommentPayload, A])(implicit
    encoder0: ArgEncoder[AddCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddCommentInput!")(encoder0)))

  /** Adds a comment to a Discussion, possibly as a reply to another comment.
    */
  def addDiscussionComment[A](input: AddDiscussionCommentInput)(innerSelection: SelectionBuilder[AddDiscussionCommentPayload, A])(implicit
    encoder0: ArgEncoder[AddDiscussionCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addDiscussionComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddDiscussionCommentInput!")(encoder0)))

  /** Adds a support entitlement to an enterprise member.
    */
  def addEnterpriseSupportEntitlement[A](input: AddEnterpriseSupportEntitlementInput)(
    innerSelection: SelectionBuilder[AddEnterpriseSupportEntitlementPayload, A]
  )(implicit encoder0: ArgEncoder[AddEnterpriseSupportEntitlementInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "addEnterpriseSupportEntitlement",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "AddEnterpriseSupportEntitlementInput!")(encoder0))
    )

  /** Adds labels to a labelable object.
    */
  def addLabelsToLabelable[A](input: AddLabelsToLabelableInput)(innerSelection: SelectionBuilder[AddLabelsToLabelablePayload, A])(implicit
    encoder0: ArgEncoder[AddLabelsToLabelableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addLabelsToLabelable", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddLabelsToLabelableInput!")(encoder0)))

  /** Adds a card to a ProjectColumn. Either `contentId` or `note` must be provided but **not** both.
    */
  def addProjectCard[A](input: AddProjectCardInput)(innerSelection: SelectionBuilder[AddProjectCardPayload, A])(implicit
    encoder0: ArgEncoder[AddProjectCardInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addProjectCard", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddProjectCardInput!")(encoder0)))

  /** Adds a column to a Project.
    */
  def addProjectColumn[A](input: AddProjectColumnInput)(innerSelection: SelectionBuilder[AddProjectColumnPayload, A])(implicit
    encoder0: ArgEncoder[AddProjectColumnInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addProjectColumn", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddProjectColumnInput!")(encoder0)))

  /** Adds an existing item (Issue or PullRequest) to a Project.
    */
  def addProjectNextItem[A](input: AddProjectNextItemInput)(innerSelection: SelectionBuilder[AddProjectNextItemPayload, A])(implicit
    encoder0: ArgEncoder[AddProjectNextItemInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addProjectNextItem", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddProjectNextItemInput!")(encoder0)))

  /** Adds a review to a Pull Request.
    */
  def addPullRequestReview[A](input: AddPullRequestReviewInput)(innerSelection: SelectionBuilder[AddPullRequestReviewPayload, A])(implicit
    encoder0: ArgEncoder[AddPullRequestReviewInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addPullRequestReview", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddPullRequestReviewInput!")(encoder0)))

  /** Adds a comment to a review.
    */
  def addPullRequestReviewComment[A](input: AddPullRequestReviewCommentInput)(
    innerSelection: SelectionBuilder[AddPullRequestReviewCommentPayload, A]
  )(implicit encoder0: ArgEncoder[AddPullRequestReviewCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "addPullRequestReviewComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "AddPullRequestReviewCommentInput!")(encoder0))
    )

  /** Adds a new thread to a pending Pull Request Review.
    */
  def addPullRequestReviewThread[A](input: AddPullRequestReviewThreadInput)(innerSelection: SelectionBuilder[AddPullRequestReviewThreadPayload, A])(
    implicit encoder0: ArgEncoder[AddPullRequestReviewThreadInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "addPullRequestReviewThread",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "AddPullRequestReviewThreadInput!")(encoder0))
  )

  /** Adds a reaction to a subject.
    */
  def addReaction[A](input: AddReactionInput)(innerSelection: SelectionBuilder[AddReactionPayload, A])(implicit
    encoder0: ArgEncoder[AddReactionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addReaction", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddReactionInput!")(encoder0)))

  /** Adds a star to a Starrable.
    */
  def addStar[A](input: AddStarInput)(innerSelection: SelectionBuilder[AddStarPayload, A])(implicit
    encoder0: ArgEncoder[AddStarInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addStar", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddStarInput!")(encoder0)))

  /** Add an upvote to a discussion or discussion comment.
    */
  def addUpvote[A](input: AddUpvoteInput)(innerSelection: SelectionBuilder[AddUpvotePayload, A])(implicit
    encoder0: ArgEncoder[AddUpvoteInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addUpvote", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddUpvoteInput!")(encoder0)))

  /** Adds a verifiable domain to an owning account.
    */
  def addVerifiableDomain[A](input: AddVerifiableDomainInput)(innerSelection: SelectionBuilder[AddVerifiableDomainPayload, A])(implicit
    encoder0: ArgEncoder[AddVerifiableDomainInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("addVerifiableDomain", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "AddVerifiableDomainInput!")(encoder0)))

  /** Approve all pending deployments under one or more environments
    */
  def approveDeployments[A](input: ApproveDeploymentsInput)(innerSelection: SelectionBuilder[ApproveDeploymentsPayload, A])(implicit
    encoder0: ArgEncoder[ApproveDeploymentsInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("approveDeployments", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ApproveDeploymentsInput!")(encoder0)))

  /** Approve a verifiable domain for notification delivery.
    */
  def approveVerifiableDomain[A](input: ApproveVerifiableDomainInput)(innerSelection: SelectionBuilder[ApproveVerifiableDomainPayload, A])(implicit
    encoder0: ArgEncoder[ApproveVerifiableDomainInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "approveVerifiableDomain",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "ApproveVerifiableDomainInput!")(encoder0))
  )

  /** Marks a repository as archived.
    */
  def archiveRepository[A](input: ArchiveRepositoryInput)(innerSelection: SelectionBuilder[ArchiveRepositoryPayload, A])(implicit
    encoder0: ArgEncoder[ArchiveRepositoryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("archiveRepository", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ArchiveRepositoryInput!")(encoder0)))

  /** Cancels a pending invitation for an administrator to join an enterprise.
    */
  def cancelEnterpriseAdminInvitation[A](input: CancelEnterpriseAdminInvitationInput)(
    innerSelection: SelectionBuilder[CancelEnterpriseAdminInvitationPayload, A]
  )(implicit encoder0: ArgEncoder[CancelEnterpriseAdminInvitationInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "cancelEnterpriseAdminInvitation",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "CancelEnterpriseAdminInvitationInput!")(encoder0))
    )

  /** Cancel an active sponsorship.
    */
  def cancelSponsorship[A](input: CancelSponsorshipInput)(innerSelection: SelectionBuilder[CancelSponsorshipPayload, A])(implicit
    encoder0: ArgEncoder[CancelSponsorshipInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("cancelSponsorship", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CancelSponsorshipInput!")(encoder0)))

  /** Update your status on GitHub.
    */
  def changeUserStatus[A](input: ChangeUserStatusInput)(innerSelection: SelectionBuilder[ChangeUserStatusPayload, A])(implicit
    encoder0: ArgEncoder[ChangeUserStatusInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("changeUserStatus", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ChangeUserStatusInput!")(encoder0)))

  /** Clears all labels from a labelable object.
    */
  def clearLabelsFromLabelable[A](input: ClearLabelsFromLabelableInput)(innerSelection: SelectionBuilder[ClearLabelsFromLabelablePayload, A])(implicit
    encoder0: ArgEncoder[ClearLabelsFromLabelableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "clearLabelsFromLabelable",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "ClearLabelsFromLabelableInput!")(encoder0))
  )

  /** Creates a new project by cloning configuration from an existing project.
    */
  def cloneProject[A](input: CloneProjectInput)(innerSelection: SelectionBuilder[CloneProjectPayload, A])(implicit
    encoder0: ArgEncoder[CloneProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("cloneProject", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CloneProjectInput!")(encoder0)))

  /** Create a new repository with the same files and directory structure as a template repository.
    */
  def cloneTemplateRepository[A](input: CloneTemplateRepositoryInput)(innerSelection: SelectionBuilder[CloneTemplateRepositoryPayload, A])(implicit
    encoder0: ArgEncoder[CloneTemplateRepositoryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "cloneTemplateRepository",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "CloneTemplateRepositoryInput!")(encoder0))
  )

  /** Close an issue.
    */
  def closeIssue[A](input: CloseIssueInput)(innerSelection: SelectionBuilder[CloseIssuePayload, A])(implicit
    encoder0: ArgEncoder[CloseIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("closeIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CloseIssueInput!")(encoder0)))

  /** Close a pull request.
    */
  def closePullRequest[A](input: ClosePullRequestInput)(innerSelection: SelectionBuilder[ClosePullRequestPayload, A])(implicit
    encoder0: ArgEncoder[ClosePullRequestInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("closePullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ClosePullRequestInput!")(encoder0)))

  /** Convert a project note card to one associated with a newly created issue.
    */
  def convertProjectCardNoteToIssue[A](input: ConvertProjectCardNoteToIssueInput)(
    innerSelection: SelectionBuilder[ConvertProjectCardNoteToIssuePayload, A]
  )(implicit encoder0: ArgEncoder[ConvertProjectCardNoteToIssueInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "convertProjectCardNoteToIssue",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "ConvertProjectCardNoteToIssueInput!")(encoder0))
    )

  /** Converts a pull request to draft
    */
  def convertPullRequestToDraft[A](input: ConvertPullRequestToDraftInput)(innerSelection: SelectionBuilder[ConvertPullRequestToDraftPayload, A])(
    implicit encoder0: ArgEncoder[ConvertPullRequestToDraftInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "convertPullRequestToDraft",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "ConvertPullRequestToDraftInput!")(encoder0))
  )

  /** Create a new branch protection rule
    */
  def createBranchProtectionRule[A](input: CreateBranchProtectionRuleInput)(innerSelection: SelectionBuilder[CreateBranchProtectionRulePayload, A])(
    implicit encoder0: ArgEncoder[CreateBranchProtectionRuleInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "createBranchProtectionRule",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "CreateBranchProtectionRuleInput!")(encoder0))
  )

  /** Create a check run.
    */
  def createCheckRun[A](input: CreateCheckRunInput)(innerSelection: SelectionBuilder[CreateCheckRunPayload, A])(implicit
    encoder0: ArgEncoder[CreateCheckRunInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createCheckRun", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateCheckRunInput!")(encoder0)))

  /** Create a check suite
    */
  def createCheckSuite[A](input: CreateCheckSuiteInput)(innerSelection: SelectionBuilder[CreateCheckSuitePayload, A])(implicit
    encoder0: ArgEncoder[CreateCheckSuiteInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createCheckSuite", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateCheckSuiteInput!")(encoder0)))

  /** Appends a commit to the given branch as the authenticated user.
    *
    * This mutation creates a commit whose parent is the HEAD of the provided
    * branch and also updates that branch to point to the new commit.
    * It can be thought of as similar to `git commit`.
    *
    * ### Locating a Branch
    *
    * Commits are appended to a `branch` of type `Ref`.
    * This must refer to a git branch (i.e.  the fully qualified path must
    * begin with `refs/heads/`, although including this prefix is optional.
    *
    * Callers may specify the `branch` to commit to either by its global node
    * ID or by passing both of `repositoryNameWithOwner` and `refName`.  For
    * more details see the documentation for `CommittableBranch`.
    *
    * ### Describing Changes
    *
    * `fileChanges` are specified as a `FilesChanges` object describing
    * `FileAdditions` and `FileDeletions`.
    *
    * Please see the documentation for `FileChanges` for more information on
    * how to use this argument to describe any set of file changes.
    *
    * ### Authorship
    *
    * Similar to the web commit interface, this mutation does not support
    * specifying the author or committer of the commit and will not add
    * support for this in the future.
    *
    * A commit created by a successful execution of this mutation will be
    * authored by the owner of the credential which authenticates the API
    * request.  The committer will be identical to that of commits authored
    * using the web interface.
    *
    * If you need full control over author and committer information, please
    * use the Git Database REST API instead.
    *
    * ### Commit Signing
    *
    * Commits made using this mutation are automatically signed by GitHub if
    * supported and will be marked as verified in the user interface.
    */
  def createCommitOnBranch[A](input: CreateCommitOnBranchInput)(innerSelection: SelectionBuilder[CreateCommitOnBranchPayload, A])(implicit
    encoder0: ArgEncoder[CreateCommitOnBranchInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createCommitOnBranch", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateCommitOnBranchInput!")(encoder0)))

  /** Create a content attachment.
    */
  def createContentAttachment[A](input: CreateContentAttachmentInput)(innerSelection: SelectionBuilder[CreateContentAttachmentPayload, A])(implicit
    encoder0: ArgEncoder[CreateContentAttachmentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "createContentAttachment",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "CreateContentAttachmentInput!")(encoder0))
  )

  /** Creates a new deployment event.
    */
  def createDeployment[A](input: CreateDeploymentInput)(innerSelection: SelectionBuilder[CreateDeploymentPayload, A])(implicit
    encoder0: ArgEncoder[CreateDeploymentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createDeployment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateDeploymentInput!")(encoder0)))

  /** Create a deployment status.
    */
  def createDeploymentStatus[A](input: CreateDeploymentStatusInput)(innerSelection: SelectionBuilder[CreateDeploymentStatusPayload, A])(implicit
    encoder0: ArgEncoder[CreateDeploymentStatusInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "createDeploymentStatus",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "CreateDeploymentStatusInput!")(encoder0))
  )

  /** Create a discussion.
    */
  def createDiscussion[A](input: CreateDiscussionInput)(innerSelection: SelectionBuilder[CreateDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[CreateDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateDiscussionInput!")(encoder0)))

  /** Creates an organization as part of an enterprise account.
    */
  def createEnterpriseOrganization[A](input: CreateEnterpriseOrganizationInput)(
    innerSelection: SelectionBuilder[CreateEnterpriseOrganizationPayload, A]
  )(implicit encoder0: ArgEncoder[CreateEnterpriseOrganizationInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "createEnterpriseOrganization",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "CreateEnterpriseOrganizationInput!")(encoder0))
    )

  /** Creates an environment or simply returns it if already exists.
    */
  def createEnvironment[A](input: CreateEnvironmentInput)(innerSelection: SelectionBuilder[CreateEnvironmentPayload, A])(implicit
    encoder0: ArgEncoder[CreateEnvironmentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createEnvironment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateEnvironmentInput!")(encoder0)))

  /** Creates a new IP allow list entry.
    */
  def createIpAllowListEntry[A](input: CreateIpAllowListEntryInput)(innerSelection: SelectionBuilder[CreateIpAllowListEntryPayload, A])(implicit
    encoder0: ArgEncoder[CreateIpAllowListEntryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "createIpAllowListEntry",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "CreateIpAllowListEntryInput!")(encoder0))
  )

  /** Creates a new issue.
    */
  def createIssue[A](input: CreateIssueInput)(innerSelection: SelectionBuilder[CreateIssuePayload, A])(implicit
    encoder0: ArgEncoder[CreateIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateIssueInput!")(encoder0)))

  /** Creates a new label.
    */
  def createLabel[A](input: CreateLabelInput)(innerSelection: SelectionBuilder[CreateLabelPayload, A])(implicit
    encoder0: ArgEncoder[CreateLabelInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createLabel", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateLabelInput!")(encoder0)))

  /** Creates a new project.
    */
  def createProject[A](input: CreateProjectInput)(innerSelection: SelectionBuilder[CreateProjectPayload, A])(implicit
    encoder0: ArgEncoder[CreateProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createProject", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateProjectInput!")(encoder0)))

  /** Create a new pull request
    */
  def createPullRequest[A](input: CreatePullRequestInput)(innerSelection: SelectionBuilder[CreatePullRequestPayload, A])(implicit
    encoder0: ArgEncoder[CreatePullRequestInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createPullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreatePullRequestInput!")(encoder0)))

  /** Create a new Git Ref.
    */
  def createRef[A](input: CreateRefInput)(innerSelection: SelectionBuilder[CreateRefPayload, A])(implicit
    encoder0: ArgEncoder[CreateRefInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createRef", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateRefInput!")(encoder0)))

  /** Create a new repository.
    */
  def createRepository[A](input: CreateRepositoryInput)(innerSelection: SelectionBuilder[CreateRepositoryPayload, A])(implicit
    encoder0: ArgEncoder[CreateRepositoryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createRepository", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateRepositoryInput!")(encoder0)))

  /** Start a new sponsorship of a maintainer in GitHub Sponsors, or reactivate a past sponsorship.
    */
  def createSponsorship[A](input: CreateSponsorshipInput)(innerSelection: SelectionBuilder[CreateSponsorshipPayload, A])(implicit
    encoder0: ArgEncoder[CreateSponsorshipInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createSponsorship", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateSponsorshipInput!")(encoder0)))

  /** Creates a new team discussion.
    */
  def createTeamDiscussion[A](input: CreateTeamDiscussionInput)(innerSelection: SelectionBuilder[CreateTeamDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[CreateTeamDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("createTeamDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "CreateTeamDiscussionInput!")(encoder0)))

  /** Creates a new team discussion comment.
    */
  def createTeamDiscussionComment[A](input: CreateTeamDiscussionCommentInput)(
    innerSelection: SelectionBuilder[CreateTeamDiscussionCommentPayload, A]
  )(implicit encoder0: ArgEncoder[CreateTeamDiscussionCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "createTeamDiscussionComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "CreateTeamDiscussionCommentInput!")(encoder0))
    )

  /** Rejects a suggested topic for the repository.
    */
  def declineTopicSuggestion[A](input: DeclineTopicSuggestionInput)(innerSelection: SelectionBuilder[DeclineTopicSuggestionPayload, A])(implicit
    encoder0: ArgEncoder[DeclineTopicSuggestionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "declineTopicSuggestion",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeclineTopicSuggestionInput!")(encoder0))
  )

  /** Delete a branch protection rule
    */
  def deleteBranchProtectionRule[A](input: DeleteBranchProtectionRuleInput)(innerSelection: SelectionBuilder[DeleteBranchProtectionRulePayload, A])(
    implicit encoder0: ArgEncoder[DeleteBranchProtectionRuleInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deleteBranchProtectionRule",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeleteBranchProtectionRuleInput!")(encoder0))
  )

  /** Deletes a deployment.
    */
  def deleteDeployment[A](input: DeleteDeploymentInput)(innerSelection: SelectionBuilder[DeleteDeploymentPayload, A])(implicit
    encoder0: ArgEncoder[DeleteDeploymentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteDeployment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteDeploymentInput!")(encoder0)))

  /** Delete a discussion and all of its replies.
    */
  def deleteDiscussion[A](input: DeleteDiscussionInput)(innerSelection: SelectionBuilder[DeleteDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[DeleteDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteDiscussionInput!")(encoder0)))

  /** Delete a discussion comment. If it has replies, wipe it instead.
    */
  def deleteDiscussionComment[A](input: DeleteDiscussionCommentInput)(innerSelection: SelectionBuilder[DeleteDiscussionCommentPayload, A])(implicit
    encoder0: ArgEncoder[DeleteDiscussionCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deleteDiscussionComment",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeleteDiscussionCommentInput!")(encoder0))
  )

  /** Deletes an environment
    */
  def deleteEnvironment[A](input: DeleteEnvironmentInput)(innerSelection: SelectionBuilder[DeleteEnvironmentPayload, A])(implicit
    encoder0: ArgEncoder[DeleteEnvironmentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteEnvironment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteEnvironmentInput!")(encoder0)))

  /** Deletes an IP allow list entry.
    */
  def deleteIpAllowListEntry[A](input: DeleteIpAllowListEntryInput)(innerSelection: SelectionBuilder[DeleteIpAllowListEntryPayload, A])(implicit
    encoder0: ArgEncoder[DeleteIpAllowListEntryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deleteIpAllowListEntry",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeleteIpAllowListEntryInput!")(encoder0))
  )

  /** Deletes an Issue object.
    */
  def deleteIssue[A](input: DeleteIssueInput)(innerSelection: SelectionBuilder[DeleteIssuePayload, A])(implicit
    encoder0: ArgEncoder[DeleteIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteIssueInput!")(encoder0)))

  /** Deletes an IssueComment object.
    */
  def deleteIssueComment[A](input: DeleteIssueCommentInput)(innerSelection: SelectionBuilder[DeleteIssueCommentPayload, A])(implicit
    encoder0: ArgEncoder[DeleteIssueCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteIssueComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteIssueCommentInput!")(encoder0)))

  /** Deletes a label.
    */
  def deleteLabel[A](input: DeleteLabelInput)(innerSelection: SelectionBuilder[DeleteLabelPayload, A])(implicit
    encoder0: ArgEncoder[DeleteLabelInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteLabel", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteLabelInput!")(encoder0)))

  /** Delete a package version.
    */
  def deletePackageVersion[A](input: DeletePackageVersionInput)(innerSelection: SelectionBuilder[DeletePackageVersionPayload, A])(implicit
    encoder0: ArgEncoder[DeletePackageVersionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deletePackageVersion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeletePackageVersionInput!")(encoder0)))

  /** Deletes a project.
    */
  def deleteProject[A](input: DeleteProjectInput)(innerSelection: SelectionBuilder[DeleteProjectPayload, A])(implicit
    encoder0: ArgEncoder[DeleteProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteProject", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteProjectInput!")(encoder0)))

  /** Deletes a project card.
    */
  def deleteProjectCard[A](input: DeleteProjectCardInput)(innerSelection: SelectionBuilder[DeleteProjectCardPayload, A])(implicit
    encoder0: ArgEncoder[DeleteProjectCardInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteProjectCard", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteProjectCardInput!")(encoder0)))

  /** Deletes a project column.
    */
  def deleteProjectColumn[A](input: DeleteProjectColumnInput)(innerSelection: SelectionBuilder[DeleteProjectColumnPayload, A])(implicit
    encoder0: ArgEncoder[DeleteProjectColumnInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteProjectColumn", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteProjectColumnInput!")(encoder0)))

  /** Deletes an item from a Project.
    */
  def deleteProjectNextItem[A](input: DeleteProjectNextItemInput)(innerSelection: SelectionBuilder[DeleteProjectNextItemPayload, A])(implicit
    encoder0: ArgEncoder[DeleteProjectNextItemInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deleteProjectNextItem",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeleteProjectNextItemInput!")(encoder0))
  )

  /** Deletes a pull request review.
    */
  def deletePullRequestReview[A](input: DeletePullRequestReviewInput)(innerSelection: SelectionBuilder[DeletePullRequestReviewPayload, A])(implicit
    encoder0: ArgEncoder[DeletePullRequestReviewInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deletePullRequestReview",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeletePullRequestReviewInput!")(encoder0))
  )

  /** Deletes a pull request review comment.
    */
  def deletePullRequestReviewComment[A](input: DeletePullRequestReviewCommentInput)(
    innerSelection: SelectionBuilder[DeletePullRequestReviewCommentPayload, A]
  )(implicit encoder0: ArgEncoder[DeletePullRequestReviewCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "deletePullRequestReviewComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "DeletePullRequestReviewCommentInput!")(encoder0))
    )

  /** Delete a Git Ref.
    */
  def deleteRef[A](input: DeleteRefInput)(innerSelection: SelectionBuilder[DeleteRefPayload, A])(implicit
    encoder0: ArgEncoder[DeleteRefInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteRef", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteRefInput!")(encoder0)))

  /** Deletes a team discussion.
    */
  def deleteTeamDiscussion[A](input: DeleteTeamDiscussionInput)(innerSelection: SelectionBuilder[DeleteTeamDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[DeleteTeamDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("deleteTeamDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "DeleteTeamDiscussionInput!")(encoder0)))

  /** Deletes a team discussion comment.
    */
  def deleteTeamDiscussionComment[A](input: DeleteTeamDiscussionCommentInput)(
    innerSelection: SelectionBuilder[DeleteTeamDiscussionCommentPayload, A]
  )(implicit encoder0: ArgEncoder[DeleteTeamDiscussionCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "deleteTeamDiscussionComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "DeleteTeamDiscussionCommentInput!")(encoder0))
    )

  /** Deletes a verifiable domain.
    */
  def deleteVerifiableDomain[A](input: DeleteVerifiableDomainInput)(innerSelection: SelectionBuilder[DeleteVerifiableDomainPayload, A])(implicit
    encoder0: ArgEncoder[DeleteVerifiableDomainInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "deleteVerifiableDomain",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DeleteVerifiableDomainInput!")(encoder0))
  )

  /** Disable auto merge on the given pull request
    */
  def disablePullRequestAutoMerge[A](input: DisablePullRequestAutoMergeInput)(
    innerSelection: SelectionBuilder[DisablePullRequestAutoMergePayload, A]
  )(implicit encoder0: ArgEncoder[DisablePullRequestAutoMergeInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "disablePullRequestAutoMerge",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "DisablePullRequestAutoMergeInput!")(encoder0))
    )

  /** Dismisses an approved or rejected pull request review.
    */
  def dismissPullRequestReview[A](input: DismissPullRequestReviewInput)(innerSelection: SelectionBuilder[DismissPullRequestReviewPayload, A])(implicit
    encoder0: ArgEncoder[DismissPullRequestReviewInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "dismissPullRequestReview",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DismissPullRequestReviewInput!")(encoder0))
  )

  /** Dismisses the Dependabot alert.
    */
  def dismissRepositoryVulnerabilityAlert[A](
    input: DismissRepositoryVulnerabilityAlertInput
  )(innerSelection: SelectionBuilder[DismissRepositoryVulnerabilityAlertPayload, A])(implicit
    encoder0: ArgEncoder[DismissRepositoryVulnerabilityAlertInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "dismissRepositoryVulnerabilityAlert",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "DismissRepositoryVulnerabilityAlertInput!")(encoder0))
  )

  /** Enable the default auto-merge on a pull request.
    */
  def enablePullRequestAutoMerge[A](input: EnablePullRequestAutoMergeInput)(innerSelection: SelectionBuilder[EnablePullRequestAutoMergePayload, A])(
    implicit encoder0: ArgEncoder[EnablePullRequestAutoMergeInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "enablePullRequestAutoMerge",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "EnablePullRequestAutoMergeInput!")(encoder0))
  )

  /** Follow a user.
    */
  def followUser[A](input: FollowUserInput)(innerSelection: SelectionBuilder[FollowUserPayload, A])(implicit
    encoder0: ArgEncoder[FollowUserInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("followUser", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "FollowUserInput!")(encoder0)))

  /** Creates a new project by importing columns and a list of issues/PRs.
    */
  def importProject[A](input: ImportProjectInput)(innerSelection: SelectionBuilder[ImportProjectPayload, A])(implicit
    encoder0: ArgEncoder[ImportProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("importProject", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ImportProjectInput!")(encoder0)))

  /** Invite someone to become an administrator of the enterprise.
    */
  def inviteEnterpriseAdmin[A](input: InviteEnterpriseAdminInput)(innerSelection: SelectionBuilder[InviteEnterpriseAdminPayload, A])(implicit
    encoder0: ArgEncoder[InviteEnterpriseAdminInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "inviteEnterpriseAdmin",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "InviteEnterpriseAdminInput!")(encoder0))
  )

  /** Creates a repository link for a project.
    */
  def linkRepositoryToProject[A](input: LinkRepositoryToProjectInput)(innerSelection: SelectionBuilder[LinkRepositoryToProjectPayload, A])(implicit
    encoder0: ArgEncoder[LinkRepositoryToProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "linkRepositoryToProject",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "LinkRepositoryToProjectInput!")(encoder0))
  )

  /** Lock a lockable object
    */
  def lockLockable[A](input: LockLockableInput)(innerSelection: SelectionBuilder[LockLockablePayload, A])(implicit
    encoder0: ArgEncoder[LockLockableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("lockLockable", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "LockLockableInput!")(encoder0)))

  /** Mark a discussion comment as the chosen answer for discussions in an answerable category.
    */
  def markDiscussionCommentAsAnswer[A](input: MarkDiscussionCommentAsAnswerInput)(
    innerSelection: SelectionBuilder[MarkDiscussionCommentAsAnswerPayload, A]
  )(implicit encoder0: ArgEncoder[MarkDiscussionCommentAsAnswerInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "markDiscussionCommentAsAnswer",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "MarkDiscussionCommentAsAnswerInput!")(encoder0))
    )

  /** Mark a pull request file as viewed
    */
  def markFileAsViewed[A](input: MarkFileAsViewedInput)(innerSelection: SelectionBuilder[MarkFileAsViewedPayload, A])(implicit
    encoder0: ArgEncoder[MarkFileAsViewedInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("markFileAsViewed", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MarkFileAsViewedInput!")(encoder0)))

  /** Marks a pull request ready for review.
    */
  def markPullRequestReadyForReview[A](input: MarkPullRequestReadyForReviewInput)(
    innerSelection: SelectionBuilder[MarkPullRequestReadyForReviewPayload, A]
  )(implicit encoder0: ArgEncoder[MarkPullRequestReadyForReviewInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "markPullRequestReadyForReview",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "MarkPullRequestReadyForReviewInput!")(encoder0))
    )

  /** Merge a head into a branch.
    */
  def mergeBranch[A](input: MergeBranchInput)(innerSelection: SelectionBuilder[MergeBranchPayload, A])(implicit
    encoder0: ArgEncoder[MergeBranchInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("mergeBranch", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MergeBranchInput!")(encoder0)))

  /** Merge a pull request.
    */
  def mergePullRequest[A](input: MergePullRequestInput)(innerSelection: SelectionBuilder[MergePullRequestPayload, A])(implicit
    encoder0: ArgEncoder[MergePullRequestInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("mergePullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MergePullRequestInput!")(encoder0)))

  /** Minimizes a comment on an Issue, Commit, Pull Request, or Gist
    */
  def minimizeComment[A](input: MinimizeCommentInput)(innerSelection: SelectionBuilder[MinimizeCommentPayload, A])(implicit
    encoder0: ArgEncoder[MinimizeCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("minimizeComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MinimizeCommentInput!")(encoder0)))

  /** Moves a project card to another place.
    */
  def moveProjectCard[A](input: MoveProjectCardInput)(innerSelection: SelectionBuilder[MoveProjectCardPayload, A])(implicit
    encoder0: ArgEncoder[MoveProjectCardInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("moveProjectCard", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MoveProjectCardInput!")(encoder0)))

  /** Moves a project column to another place.
    */
  def moveProjectColumn[A](input: MoveProjectColumnInput)(innerSelection: SelectionBuilder[MoveProjectColumnPayload, A])(implicit
    encoder0: ArgEncoder[MoveProjectColumnInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("moveProjectColumn", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "MoveProjectColumnInput!")(encoder0)))

  /** Pin an issue to a repository
    */
  def pinIssue[A](input: PinIssueInput)(innerSelection: SelectionBuilder[PinIssuePayload, A])(implicit
    encoder0: ArgEncoder[PinIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("pinIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "PinIssueInput!")(encoder0)))

  /** Regenerates the identity provider recovery codes for an enterprise
    */
  def regenerateEnterpriseIdentityProviderRecoveryCodes[A](
    input: RegenerateEnterpriseIdentityProviderRecoveryCodesInput
  )(innerSelection: SelectionBuilder[RegenerateEnterpriseIdentityProviderRecoveryCodesPayload, A])(implicit
    encoder0: ArgEncoder[RegenerateEnterpriseIdentityProviderRecoveryCodesInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "regenerateEnterpriseIdentityProviderRecoveryCodes",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RegenerateEnterpriseIdentityProviderRecoveryCodesInput!")(encoder0))
  )

  /** Regenerates a verifiable domain's verification token.
    */
  def regenerateVerifiableDomainToken[A](input: RegenerateVerifiableDomainTokenInput)(
    innerSelection: SelectionBuilder[RegenerateVerifiableDomainTokenPayload, A]
  )(implicit encoder0: ArgEncoder[RegenerateVerifiableDomainTokenInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "regenerateVerifiableDomainToken",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "RegenerateVerifiableDomainTokenInput!")(encoder0))
    )

  /** Reject all pending deployments under one or more environments
    */
  def rejectDeployments[A](input: RejectDeploymentsInput)(innerSelection: SelectionBuilder[RejectDeploymentsPayload, A])(implicit
    encoder0: ArgEncoder[RejectDeploymentsInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("rejectDeployments", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RejectDeploymentsInput!")(encoder0)))

  /** Removes assignees from an assignable object.
    */
  def removeAssigneesFromAssignable[A](input: RemoveAssigneesFromAssignableInput)(
    innerSelection: SelectionBuilder[RemoveAssigneesFromAssignablePayload, A]
  )(implicit encoder0: ArgEncoder[RemoveAssigneesFromAssignableInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "removeAssigneesFromAssignable",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "RemoveAssigneesFromAssignableInput!")(encoder0))
    )

  /** Removes an administrator from the enterprise.
    */
  def removeEnterpriseAdmin[A](input: RemoveEnterpriseAdminInput)(innerSelection: SelectionBuilder[RemoveEnterpriseAdminPayload, A])(implicit
    encoder0: ArgEncoder[RemoveEnterpriseAdminInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "removeEnterpriseAdmin",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RemoveEnterpriseAdminInput!")(encoder0))
  )

  /** Removes the identity provider from an enterprise
    */
  def removeEnterpriseIdentityProvider[A](
    input: RemoveEnterpriseIdentityProviderInput
  )(innerSelection: SelectionBuilder[RemoveEnterpriseIdentityProviderPayload, A])(implicit
    encoder0: ArgEncoder[RemoveEnterpriseIdentityProviderInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "removeEnterpriseIdentityProvider",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RemoveEnterpriseIdentityProviderInput!")(encoder0))
  )

  /** Removes an organization from the enterprise
    */
  def removeEnterpriseOrganization[A](input: RemoveEnterpriseOrganizationInput)(
    innerSelection: SelectionBuilder[RemoveEnterpriseOrganizationPayload, A]
  )(implicit encoder0: ArgEncoder[RemoveEnterpriseOrganizationInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "removeEnterpriseOrganization",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "RemoveEnterpriseOrganizationInput!")(encoder0))
    )

  /** Removes a support entitlement from an enterprise member.
    */
  def removeEnterpriseSupportEntitlement[A](
    input: RemoveEnterpriseSupportEntitlementInput
  )(innerSelection: SelectionBuilder[RemoveEnterpriseSupportEntitlementPayload, A])(implicit
    encoder0: ArgEncoder[RemoveEnterpriseSupportEntitlementInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "removeEnterpriseSupportEntitlement",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RemoveEnterpriseSupportEntitlementInput!")(encoder0))
  )

  /** Removes labels from a Labelable object.
    */
  def removeLabelsFromLabelable[A](input: RemoveLabelsFromLabelableInput)(innerSelection: SelectionBuilder[RemoveLabelsFromLabelablePayload, A])(
    implicit encoder0: ArgEncoder[RemoveLabelsFromLabelableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "removeLabelsFromLabelable",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RemoveLabelsFromLabelableInput!")(encoder0))
  )

  /** Removes outside collaborator from all repositories in an organization.
    */
  def removeOutsideCollaborator[A](input: RemoveOutsideCollaboratorInput)(innerSelection: SelectionBuilder[RemoveOutsideCollaboratorPayload, A])(
    implicit encoder0: ArgEncoder[RemoveOutsideCollaboratorInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "removeOutsideCollaborator",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "RemoveOutsideCollaboratorInput!")(encoder0))
  )

  /** Removes a reaction from a subject.
    */
  def removeReaction[A](input: RemoveReactionInput)(innerSelection: SelectionBuilder[RemoveReactionPayload, A])(implicit
    encoder0: ArgEncoder[RemoveReactionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("removeReaction", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RemoveReactionInput!")(encoder0)))

  /** Removes a star from a Starrable.
    */
  def removeStar[A](input: RemoveStarInput)(innerSelection: SelectionBuilder[RemoveStarPayload, A])(implicit
    encoder0: ArgEncoder[RemoveStarInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("removeStar", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RemoveStarInput!")(encoder0)))

  /** Remove an upvote to a discussion or discussion comment.
    */
  def removeUpvote[A](input: RemoveUpvoteInput)(innerSelection: SelectionBuilder[RemoveUpvotePayload, A])(implicit
    encoder0: ArgEncoder[RemoveUpvoteInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("removeUpvote", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RemoveUpvoteInput!")(encoder0)))

  /** Reopen a issue.
    */
  def reopenIssue[A](input: ReopenIssueInput)(innerSelection: SelectionBuilder[ReopenIssuePayload, A])(implicit
    encoder0: ArgEncoder[ReopenIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("reopenIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ReopenIssueInput!")(encoder0)))

  /** Reopen a pull request.
    */
  def reopenPullRequest[A](input: ReopenPullRequestInput)(innerSelection: SelectionBuilder[ReopenPullRequestPayload, A])(implicit
    encoder0: ArgEncoder[ReopenPullRequestInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("reopenPullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ReopenPullRequestInput!")(encoder0)))

  /** Set review requests on a pull request.
    */
  def requestReviews[A](input: RequestReviewsInput)(innerSelection: SelectionBuilder[RequestReviewsPayload, A])(implicit
    encoder0: ArgEncoder[RequestReviewsInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("requestReviews", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RequestReviewsInput!")(encoder0)))

  /** Rerequests an existing check suite.
    */
  def rerequestCheckSuite[A](input: RerequestCheckSuiteInput)(innerSelection: SelectionBuilder[RerequestCheckSuitePayload, A])(implicit
    encoder0: ArgEncoder[RerequestCheckSuiteInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("rerequestCheckSuite", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "RerequestCheckSuiteInput!")(encoder0)))

  /** Marks a review thread as resolved.
    */
  def resolveReviewThread[A](input: ResolveReviewThreadInput)(innerSelection: SelectionBuilder[ResolveReviewThreadPayload, A])(implicit
    encoder0: ArgEncoder[ResolveReviewThreadInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("resolveReviewThread", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "ResolveReviewThreadInput!")(encoder0)))

  /** Creates or updates the identity provider for an enterprise.
    */
  def setEnterpriseIdentityProvider[A](input: SetEnterpriseIdentityProviderInput)(
    innerSelection: SelectionBuilder[SetEnterpriseIdentityProviderPayload, A]
  )(implicit encoder0: ArgEncoder[SetEnterpriseIdentityProviderInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "setEnterpriseIdentityProvider",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "SetEnterpriseIdentityProviderInput!")(encoder0))
    )

  /** Set an organization level interaction limit for an organization's public repositories.
    */
  def setOrganizationInteractionLimit[A](input: SetOrganizationInteractionLimitInput)(
    innerSelection: SelectionBuilder[SetOrganizationInteractionLimitPayload, A]
  )(implicit encoder0: ArgEncoder[SetOrganizationInteractionLimitInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "setOrganizationInteractionLimit",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "SetOrganizationInteractionLimitInput!")(encoder0))
    )

  /** Sets an interaction limit setting for a repository.
    */
  def setRepositoryInteractionLimit[A](input: SetRepositoryInteractionLimitInput)(
    innerSelection: SelectionBuilder[SetRepositoryInteractionLimitPayload, A]
  )(implicit encoder0: ArgEncoder[SetRepositoryInteractionLimitInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "setRepositoryInteractionLimit",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "SetRepositoryInteractionLimitInput!")(encoder0))
    )

  /** Set a user level interaction limit for an user's public repositories.
    */
  def setUserInteractionLimit[A](input: SetUserInteractionLimitInput)(innerSelection: SelectionBuilder[SetUserInteractionLimitPayload, A])(implicit
    encoder0: ArgEncoder[SetUserInteractionLimitInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "setUserInteractionLimit",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "SetUserInteractionLimitInput!")(encoder0))
  )

  /** Submits a pending pull request review.
    */
  def submitPullRequestReview[A](input: SubmitPullRequestReviewInput)(innerSelection: SelectionBuilder[SubmitPullRequestReviewPayload, A])(implicit
    encoder0: ArgEncoder[SubmitPullRequestReviewInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "submitPullRequestReview",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "SubmitPullRequestReviewInput!")(encoder0))
  )

  /** Transfer an issue to a different repository
    */
  def transferIssue[A](input: TransferIssueInput)(innerSelection: SelectionBuilder[TransferIssuePayload, A])(implicit
    encoder0: ArgEncoder[TransferIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("transferIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "TransferIssueInput!")(encoder0)))

  /** Unarchives a repository.
    */
  def unarchiveRepository[A](input: UnarchiveRepositoryInput)(innerSelection: SelectionBuilder[UnarchiveRepositoryPayload, A])(implicit
    encoder0: ArgEncoder[UnarchiveRepositoryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unarchiveRepository", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnarchiveRepositoryInput!")(encoder0)))

  /** Unfollow a user.
    */
  def unfollowUser[A](input: UnfollowUserInput)(innerSelection: SelectionBuilder[UnfollowUserPayload, A])(implicit
    encoder0: ArgEncoder[UnfollowUserInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unfollowUser", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnfollowUserInput!")(encoder0)))

  /** Deletes a repository link from a project.
    */
  def unlinkRepositoryFromProject[A](input: UnlinkRepositoryFromProjectInput)(
    innerSelection: SelectionBuilder[UnlinkRepositoryFromProjectPayload, A]
  )(implicit encoder0: ArgEncoder[UnlinkRepositoryFromProjectInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "unlinkRepositoryFromProject",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UnlinkRepositoryFromProjectInput!")(encoder0))
    )

  /** Unlock a lockable object
    */
  def unlockLockable[A](input: UnlockLockableInput)(innerSelection: SelectionBuilder[UnlockLockablePayload, A])(implicit
    encoder0: ArgEncoder[UnlockLockableInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unlockLockable", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnlockLockableInput!")(encoder0)))

  /** Unmark a discussion comment as the chosen answer for discussions in an answerable category.
    */
  def unmarkDiscussionCommentAsAnswer[A](input: UnmarkDiscussionCommentAsAnswerInput)(
    innerSelection: SelectionBuilder[UnmarkDiscussionCommentAsAnswerPayload, A]
  )(implicit encoder0: ArgEncoder[UnmarkDiscussionCommentAsAnswerInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "unmarkDiscussionCommentAsAnswer",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UnmarkDiscussionCommentAsAnswerInput!")(encoder0))
    )

  /** Unmark a pull request file as viewed
    */
  def unmarkFileAsViewed[A](input: UnmarkFileAsViewedInput)(innerSelection: SelectionBuilder[UnmarkFileAsViewedPayload, A])(implicit
    encoder0: ArgEncoder[UnmarkFileAsViewedInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unmarkFileAsViewed", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnmarkFileAsViewedInput!")(encoder0)))

  /** Unmark an issue as a duplicate of another issue.
    */
  def unmarkIssueAsDuplicate[A](input: UnmarkIssueAsDuplicateInput)(innerSelection: SelectionBuilder[UnmarkIssueAsDuplicatePayload, A])(implicit
    encoder0: ArgEncoder[UnmarkIssueAsDuplicateInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "unmarkIssueAsDuplicate",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UnmarkIssueAsDuplicateInput!")(encoder0))
  )

  /** Unminimizes a comment on an Issue, Commit, Pull Request, or Gist
    */
  def unminimizeComment[A](input: UnminimizeCommentInput)(innerSelection: SelectionBuilder[UnminimizeCommentPayload, A])(implicit
    encoder0: ArgEncoder[UnminimizeCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unminimizeComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnminimizeCommentInput!")(encoder0)))

  /** Unpin a pinned issue from a repository
    */
  def unpinIssue[A](input: UnpinIssueInput)(innerSelection: SelectionBuilder[UnpinIssuePayload, A])(implicit
    encoder0: ArgEncoder[UnpinIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("unpinIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UnpinIssueInput!")(encoder0)))

  /** Marks a review thread as unresolved.
    */
  def unresolveReviewThread[A](input: UnresolveReviewThreadInput)(innerSelection: SelectionBuilder[UnresolveReviewThreadPayload, A])(implicit
    encoder0: ArgEncoder[UnresolveReviewThreadInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "unresolveReviewThread",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UnresolveReviewThreadInput!")(encoder0))
  )

  /** Create a new branch protection rule
    */
  def updateBranchProtectionRule[A](input: UpdateBranchProtectionRuleInput)(innerSelection: SelectionBuilder[UpdateBranchProtectionRulePayload, A])(
    implicit encoder0: ArgEncoder[UpdateBranchProtectionRuleInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateBranchProtectionRule",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateBranchProtectionRuleInput!")(encoder0))
  )

  /** Update a check run
    */
  def updateCheckRun[A](input: UpdateCheckRunInput)(innerSelection: SelectionBuilder[UpdateCheckRunPayload, A])(implicit
    encoder0: ArgEncoder[UpdateCheckRunInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateCheckRun", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateCheckRunInput!")(encoder0)))

  /** Modifies the settings of an existing check suite
    */
  def updateCheckSuitePreferences[A](input: UpdateCheckSuitePreferencesInput)(
    innerSelection: SelectionBuilder[UpdateCheckSuitePreferencesPayload, A]
  )(implicit encoder0: ArgEncoder[UpdateCheckSuitePreferencesInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "updateCheckSuitePreferences",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UpdateCheckSuitePreferencesInput!")(encoder0))
    )

  /** Update a discussion
    */
  def updateDiscussion[A](input: UpdateDiscussionInput)(innerSelection: SelectionBuilder[UpdateDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[UpdateDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateDiscussionInput!")(encoder0)))

  /** Update the contents of a comment on a Discussion
    */
  def updateDiscussionComment[A](input: UpdateDiscussionCommentInput)(innerSelection: SelectionBuilder[UpdateDiscussionCommentPayload, A])(implicit
    encoder0: ArgEncoder[UpdateDiscussionCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateDiscussionComment",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateDiscussionCommentInput!")(encoder0))
  )

  /** Updates the role of an enterprise administrator.
    */
  def updateEnterpriseAdministratorRole[A](
    input: UpdateEnterpriseAdministratorRoleInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseAdministratorRolePayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseAdministratorRoleInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseAdministratorRole",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseAdministratorRoleInput!")(encoder0))
  )

  /** Sets whether private repository forks are enabled for an enterprise.
    */
  def updateEnterpriseAllowPrivateRepositoryForkingSetting[A](
    input: UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseAllowPrivateRepositoryForkingSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseAllowPrivateRepositoryForkingSettingInput!")(encoder0))
  )

  /** Sets the base repository permission for organizations in an enterprise.
    */
  def updateEnterpriseDefaultRepositoryPermissionSetting[A](
    input: UpdateEnterpriseDefaultRepositoryPermissionSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseDefaultRepositoryPermissionSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseDefaultRepositoryPermissionSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseDefaultRepositoryPermissionSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseDefaultRepositoryPermissionSettingInput!")(encoder0))
  )

  /** Sets whether organization members with admin permissions on a repository can change repository visibility.
    */
  def updateEnterpriseMembersCanChangeRepositoryVisibilitySetting[A](
    input: UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanChangeRepositoryVisibilitySetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanChangeRepositoryVisibilitySettingInput!")(encoder0))
  )

  /** Sets the members can create repositories setting for an enterprise.
    */
  def updateEnterpriseMembersCanCreateRepositoriesSetting[A](
    input: UpdateEnterpriseMembersCanCreateRepositoriesSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanCreateRepositoriesSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanCreateRepositoriesSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanCreateRepositoriesSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanCreateRepositoriesSettingInput!")(encoder0))
  )

  /** Sets the members can delete issues setting for an enterprise.
    */
  def updateEnterpriseMembersCanDeleteIssuesSetting[A](
    input: UpdateEnterpriseMembersCanDeleteIssuesSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanDeleteIssuesSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanDeleteIssuesSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanDeleteIssuesSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanDeleteIssuesSettingInput!")(encoder0))
  )

  /** Sets the members can delete repositories setting for an enterprise.
    */
  def updateEnterpriseMembersCanDeleteRepositoriesSetting[A](
    input: UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanDeleteRepositoriesSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanDeleteRepositoriesSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanDeleteRepositoriesSettingInput!")(encoder0))
  )

  /** Sets whether members can invite collaborators are enabled for an enterprise.
    */
  def updateEnterpriseMembersCanInviteCollaboratorsSetting[A](
    input: UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanInviteCollaboratorsSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanInviteCollaboratorsSettingInput!")(encoder0))
  )

  /** Sets whether or not an organization admin can make purchases.
    */
  def updateEnterpriseMembersCanMakePurchasesSetting[A](
    input: UpdateEnterpriseMembersCanMakePurchasesSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanMakePurchasesSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanMakePurchasesSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanMakePurchasesSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanMakePurchasesSettingInput!")(encoder0))
  )

  /** Sets the members can update protected branches setting for an enterprise.
    */
  def updateEnterpriseMembersCanUpdateProtectedBranchesSetting[A](
    input: UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanUpdateProtectedBranchesSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanUpdateProtectedBranchesSettingInput!")(encoder0))
  )

  /** Sets the members can view dependency insights for an enterprise.
    */
  def updateEnterpriseMembersCanViewDependencyInsightsSetting[A](
    input: UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseMembersCanViewDependencyInsightsSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseMembersCanViewDependencyInsightsSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseMembersCanViewDependencyInsightsSettingInput!")(encoder0))
  )

  /** Sets whether organization projects are enabled for an enterprise.
    */
  def updateEnterpriseOrganizationProjectsSetting[A](
    input: UpdateEnterpriseOrganizationProjectsSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseOrganizationProjectsSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseOrganizationProjectsSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseOrganizationProjectsSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseOrganizationProjectsSettingInput!")(encoder0))
  )

  /** Updates an enterprise's profile.
    */
  def updateEnterpriseProfile[A](input: UpdateEnterpriseProfileInput)(innerSelection: SelectionBuilder[UpdateEnterpriseProfilePayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseProfileInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseProfile",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseProfileInput!")(encoder0))
  )

  /** Sets whether repository projects are enabled for a enterprise.
    */
  def updateEnterpriseRepositoryProjectsSetting[A](
    input: UpdateEnterpriseRepositoryProjectsSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseRepositoryProjectsSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseRepositoryProjectsSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseRepositoryProjectsSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseRepositoryProjectsSettingInput!")(encoder0))
  )

  /** Sets whether team discussions are enabled for an enterprise.
    */
  def updateEnterpriseTeamDiscussionsSetting[A](
    input: UpdateEnterpriseTeamDiscussionsSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseTeamDiscussionsSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseTeamDiscussionsSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseTeamDiscussionsSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseTeamDiscussionsSettingInput!")(encoder0))
  )

  /** Sets whether two factor authentication is required for all users in an enterprise.
    */
  def updateEnterpriseTwoFactorAuthenticationRequiredSetting[A](
    input: UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput
  )(innerSelection: SelectionBuilder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateEnterpriseTwoFactorAuthenticationRequiredSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateEnterpriseTwoFactorAuthenticationRequiredSettingInput!")(encoder0))
  )

  /** Updates an environment.
    */
  def updateEnvironment[A](input: UpdateEnvironmentInput)(innerSelection: SelectionBuilder[UpdateEnvironmentPayload, A])(implicit
    encoder0: ArgEncoder[UpdateEnvironmentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateEnvironment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateEnvironmentInput!")(encoder0)))

  /** Sets whether an IP allow list is enabled on an owner.
    */
  def updateIpAllowListEnabledSetting[A](input: UpdateIpAllowListEnabledSettingInput)(
    innerSelection: SelectionBuilder[UpdateIpAllowListEnabledSettingPayload, A]
  )(implicit encoder0: ArgEncoder[UpdateIpAllowListEnabledSettingInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "updateIpAllowListEnabledSetting",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UpdateIpAllowListEnabledSettingInput!")(encoder0))
    )

  /** Updates an IP allow list entry.
    */
  def updateIpAllowListEntry[A](input: UpdateIpAllowListEntryInput)(innerSelection: SelectionBuilder[UpdateIpAllowListEntryPayload, A])(implicit
    encoder0: ArgEncoder[UpdateIpAllowListEntryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateIpAllowListEntry",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateIpAllowListEntryInput!")(encoder0))
  )

  /** Sets whether IP allow list configuration for installed GitHub Apps is enabled on an owner.
    */
  def updateIpAllowListForInstalledAppsEnabledSetting[A](
    input: UpdateIpAllowListForInstalledAppsEnabledSettingInput
  )(innerSelection: SelectionBuilder[UpdateIpAllowListForInstalledAppsEnabledSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateIpAllowListForInstalledAppsEnabledSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateIpAllowListForInstalledAppsEnabledSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateIpAllowListForInstalledAppsEnabledSettingInput!")(encoder0))
  )

  /** Updates an Issue.
    */
  def updateIssue[A](input: UpdateIssueInput)(innerSelection: SelectionBuilder[UpdateIssuePayload, A])(implicit
    encoder0: ArgEncoder[UpdateIssueInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateIssue", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateIssueInput!")(encoder0)))

  /** Updates an IssueComment object.
    */
  def updateIssueComment[A](input: UpdateIssueCommentInput)(innerSelection: SelectionBuilder[UpdateIssueCommentPayload, A])(implicit
    encoder0: ArgEncoder[UpdateIssueCommentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateIssueComment", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateIssueCommentInput!")(encoder0)))

  /** Updates an existing label.
    */
  def updateLabel[A](input: UpdateLabelInput)(innerSelection: SelectionBuilder[UpdateLabelPayload, A])(implicit
    encoder0: ArgEncoder[UpdateLabelInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateLabel", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateLabelInput!")(encoder0)))

  /** Update the setting to restrict notifications to only verified or approved domains available to an owner.
    */
  def updateNotificationRestrictionSetting[A](
    input: UpdateNotificationRestrictionSettingInput
  )(innerSelection: SelectionBuilder[UpdateNotificationRestrictionSettingPayload, A])(implicit
    encoder0: ArgEncoder[UpdateNotificationRestrictionSettingInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateNotificationRestrictionSetting",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateNotificationRestrictionSettingInput!")(encoder0))
  )

  /** Updates an existing project.
    */
  def updateProject[A](input: UpdateProjectInput)(innerSelection: SelectionBuilder[UpdateProjectPayload, A])(implicit
    encoder0: ArgEncoder[UpdateProjectInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateProject", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateProjectInput!")(encoder0)))

  /** Updates an existing project card.
    */
  def updateProjectCard[A](input: UpdateProjectCardInput)(innerSelection: SelectionBuilder[UpdateProjectCardPayload, A])(implicit
    encoder0: ArgEncoder[UpdateProjectCardInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateProjectCard", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateProjectCardInput!")(encoder0)))

  /** Updates an existing project column.
    */
  def updateProjectColumn[A](input: UpdateProjectColumnInput)(innerSelection: SelectionBuilder[UpdateProjectColumnPayload, A])(implicit
    encoder0: ArgEncoder[UpdateProjectColumnInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateProjectColumn", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateProjectColumnInput!")(encoder0)))

  /** Updates a field of an item from a Project.
    */
  def updateProjectNextItemField[A](input: UpdateProjectNextItemFieldInput)(innerSelection: SelectionBuilder[UpdateProjectNextItemFieldPayload, A])(
    implicit encoder0: ArgEncoder[UpdateProjectNextItemFieldInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateProjectNextItemField",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateProjectNextItemFieldInput!")(encoder0))
  )

  /** Update a pull request
    */
  def updatePullRequest[A](input: UpdatePullRequestInput)(innerSelection: SelectionBuilder[UpdatePullRequestPayload, A])(implicit
    encoder0: ArgEncoder[UpdatePullRequestInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updatePullRequest", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdatePullRequestInput!")(encoder0)))

  /** Merge HEAD from upstream branch into pull request branch
    */
  def updatePullRequestBranch[A](input: UpdatePullRequestBranchInput)(innerSelection: SelectionBuilder[UpdatePullRequestBranchPayload, A])(implicit
    encoder0: ArgEncoder[UpdatePullRequestBranchInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updatePullRequestBranch",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdatePullRequestBranchInput!")(encoder0))
  )

  /** Updates the body of a pull request review.
    */
  def updatePullRequestReview[A](input: UpdatePullRequestReviewInput)(innerSelection: SelectionBuilder[UpdatePullRequestReviewPayload, A])(implicit
    encoder0: ArgEncoder[UpdatePullRequestReviewInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updatePullRequestReview",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdatePullRequestReviewInput!")(encoder0))
  )

  /** Updates a pull request review comment.
    */
  def updatePullRequestReviewComment[A](input: UpdatePullRequestReviewCommentInput)(
    innerSelection: SelectionBuilder[UpdatePullRequestReviewCommentPayload, A]
  )(implicit encoder0: ArgEncoder[UpdatePullRequestReviewCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "updatePullRequestReviewComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UpdatePullRequestReviewCommentInput!")(encoder0))
    )

  /** Update a Git Ref.
    */
  def updateRef[A](input: UpdateRefInput)(innerSelection: SelectionBuilder[UpdateRefPayload, A])(implicit
    encoder0: ArgEncoder[UpdateRefInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateRef", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateRefInput!")(encoder0)))

  /** Creates, updates and/or deletes multiple refs in a repository.
    *
    * This mutation takes a list of `RefUpdate`s and performs these updates
    * on the repository. All updates are performed atomically, meaning that
    * if one of them is rejected, no other ref will be modified.
    *
    * `RefUpdate.beforeOid` specifies that the given reference needs to point
    * to the given value before performing any updates. A value of
    * `0000000000000000000000000000000000000000` can be used to verify that
    * the references should not exist.
    *
    * `RefUpdate.afterOid` specifies the value that the given reference
    * will point to after performing all updates. A value of
    * `0000000000000000000000000000000000000000` can be used to delete a
    * reference.
    *
    * If `RefUpdate.force` is set to `true`, a non-fast-forward updates
    * for the given reference will be allowed.
    */
  def updateRefs[A](input: UpdateRefsInput)(innerSelection: SelectionBuilder[UpdateRefsPayload, A])(implicit
    encoder0: ArgEncoder[UpdateRefsInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateRefs", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateRefsInput!")(encoder0)))

  /** Update information about a repository.
    */
  def updateRepository[A](input: UpdateRepositoryInput)(innerSelection: SelectionBuilder[UpdateRepositoryPayload, A])(implicit
    encoder0: ArgEncoder[UpdateRepositoryInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateRepository", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateRepositoryInput!")(encoder0)))

  /** Change visibility of your sponsorship and opt in or out of email updates from the maintainer.
    */
  def updateSponsorshipPreferences[A](input: UpdateSponsorshipPreferencesInput)(
    innerSelection: SelectionBuilder[UpdateSponsorshipPreferencesPayload, A]
  )(implicit encoder0: ArgEncoder[UpdateSponsorshipPreferencesInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "updateSponsorshipPreferences",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UpdateSponsorshipPreferencesInput!")(encoder0))
    )

  /** Updates the state for subscribable subjects.
    */
  def updateSubscription[A](input: UpdateSubscriptionInput)(innerSelection: SelectionBuilder[UpdateSubscriptionPayload, A])(implicit
    encoder0: ArgEncoder[UpdateSubscriptionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateSubscription", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateSubscriptionInput!")(encoder0)))

  /** Updates a team discussion.
    */
  def updateTeamDiscussion[A](input: UpdateTeamDiscussionInput)(innerSelection: SelectionBuilder[UpdateTeamDiscussionPayload, A])(implicit
    encoder0: ArgEncoder[UpdateTeamDiscussionInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateTeamDiscussion", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateTeamDiscussionInput!")(encoder0)))

  /** Updates a discussion comment.
    */
  def updateTeamDiscussionComment[A](input: UpdateTeamDiscussionCommentInput)(
    innerSelection: SelectionBuilder[UpdateTeamDiscussionCommentPayload, A]
  )(implicit encoder0: ArgEncoder[UpdateTeamDiscussionCommentInput]): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] =
    _root_.caliban.client.SelectionBuilder.Field(
      "updateTeamDiscussionComment",
      OptionOf(Obj(innerSelection)),
      arguments = List(Argument("input", input, "UpdateTeamDiscussionCommentInput!")(encoder0))
    )

  /** Updates team review assignment.
    */
  def updateTeamReviewAssignment[A](input: UpdateTeamReviewAssignmentInput)(innerSelection: SelectionBuilder[UpdateTeamReviewAssignmentPayload, A])(
    implicit encoder0: ArgEncoder[UpdateTeamReviewAssignmentInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "updateTeamReviewAssignment",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "UpdateTeamReviewAssignmentInput!")(encoder0))
  )

  /** Replaces the repository's topics with the given topics.
    */
  def updateTopics[A](input: UpdateTopicsInput)(innerSelection: SelectionBuilder[UpdateTopicsPayload, A])(implicit
    encoder0: ArgEncoder[UpdateTopicsInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder
    .Field("updateTopics", OptionOf(Obj(innerSelection)), arguments = List(Argument("input", input, "UpdateTopicsInput!")(encoder0)))

  /** Verify that a verifiable domain has the expected DNS record.
    */
  def verifyVerifiableDomain[A](input: VerifyVerifiableDomainInput)(innerSelection: SelectionBuilder[VerifyVerifiableDomainPayload, A])(implicit
    encoder0: ArgEncoder[VerifyVerifiableDomainInput]
  ): SelectionBuilder[_root_.caliban.client.Operations.RootMutation, Option[A]] = _root_.caliban.client.SelectionBuilder.Field(
    "verifyVerifiableDomain",
    OptionOf(Obj(innerSelection)),
    arguments = List(Argument("input", input, "VerifyVerifiableDomainInput!")(encoder0))
  )
}

