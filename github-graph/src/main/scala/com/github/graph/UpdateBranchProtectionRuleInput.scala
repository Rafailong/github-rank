package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class UpdateBranchProtectionRuleInput(
  allowsDeletions: Option[Boolean]   = None,
  allowsForcePushes: Option[Boolean] = None,
  branchProtectionRuleId: String,
  clientMutationId: Option[String]                             = None,
  dismissesStaleReviews: Option[Boolean]                       = None,
  isAdminEnforced: Option[Boolean]                             = None,
  pattern: Option[String]                                      = None,
  pushActorIds: Option[List[String]]                           = None,
  requiredApprovingReviewCount: Option[Int]                    = None,
  requiredStatusCheckContexts: Option[List[String]]            = None,
  requiredStatusChecks: Option[List[RequiredStatusCheckInput]] = None,
  requiresApprovingReviews: Option[Boolean]                    = None,
  requiresCodeOwnerReviews: Option[Boolean]                    = None,
  requiresCommitSignatures: Option[Boolean]                    = None,
  requiresConversationResolution: Option[Boolean]              = None,
  requiresLinearHistory: Option[Boolean]                       = None,
  requiresStatusChecks: Option[Boolean]                        = None,
  requiresStrictStatusChecks: Option[Boolean]                  = None,
  restrictsPushes: Option[Boolean]                             = None,
  restrictsReviewDismissals: Option[Boolean]                   = None,
  reviewDismissalActorIds: Option[List[String]]                = None
)

object UpdateBranchProtectionRuleInput {

  implicit val encoder: ArgEncoder[UpdateBranchProtectionRuleInput] = new ArgEncoder[UpdateBranchProtectionRuleInput] {

    override def encode(value: UpdateBranchProtectionRuleInput): __Value =
      __ObjectValue(
        List(
          "allowsDeletions"        -> value.allowsDeletions.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "allowsForcePushes"      -> value.allowsForcePushes.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "branchProtectionRuleId" -> implicitly[ArgEncoder[String]].encode(value.branchProtectionRuleId),
          "clientMutationId"       -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "dismissesStaleReviews"  -> value.dismissesStaleReviews.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "isAdminEnforced"        -> value.isAdminEnforced.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "pattern"                -> value.pattern.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "pushActorIds" -> value.pushActorIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "requiredApprovingReviewCount" -> value.requiredApprovingReviewCount.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Int]].encode(value)
          ),
          "requiredStatusCheckContexts" -> value.requiredStatusCheckContexts.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          ),
          "requiredStatusChecks" -> value.requiredStatusChecks.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[RequiredStatusCheckInput]].encode(value)))
          ),
          "requiresApprovingReviews" -> value.requiresApprovingReviews.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "requiresCodeOwnerReviews" -> value.requiresCodeOwnerReviews.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "requiresCommitSignatures" -> value.requiresCommitSignatures.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "requiresConversationResolution" -> value.requiresConversationResolution.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "requiresLinearHistory" -> value.requiresLinearHistory.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "requiresStatusChecks"  -> value.requiresStatusChecks.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "requiresStrictStatusChecks" -> value.requiresStrictStatusChecks.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "restrictsPushes" -> value.restrictsPushes.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[Boolean]].encode(value)),
          "restrictsReviewDismissals" -> value.restrictsReviewDismissals.fold(__NullValue: __Value)(value =>
            implicitly[ArgEncoder[Boolean]].encode(value)
          ),
          "reviewDismissalActorIds" -> value.reviewDismissalActorIds.fold(__NullValue: __Value)(value =>
            __ListValue(value.map(value => implicitly[ArgEncoder[String]].encode(value)))
          )
        )
      )
  }
}

