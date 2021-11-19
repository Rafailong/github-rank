package com.github.graph

import caliban.client._
import caliban.client.__Value._

final case class EnablePullRequestAutoMergeInput(
  authorEmail: Option[String]                 = None,
  clientMutationId: Option[String]            = None,
  commitBody: Option[String]                  = None,
  commitHeadline: Option[String]              = None,
  mergeMethod: Option[PullRequestMergeMethod] = None,
  pullRequestId: String
)

object EnablePullRequestAutoMergeInput {

  implicit val encoder: ArgEncoder[EnablePullRequestAutoMergeInput] = new ArgEncoder[EnablePullRequestAutoMergeInput] {

    override def encode(value: EnablePullRequestAutoMergeInput): __Value =
      __ObjectValue(
        List(
          "authorEmail"      -> value.authorEmail.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "clientMutationId" -> value.clientMutationId.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitBody"       -> value.commitBody.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "commitHeadline"   -> value.commitHeadline.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[String]].encode(value)),
          "mergeMethod"      -> value.mergeMethod.fold(__NullValue: __Value)(value => implicitly[ArgEncoder[PullRequestMergeMethod]].encode(value)),
          "pullRequestId"    -> implicitly[ArgEncoder[String]].encode(value.pullRequestId)
        )
      )
  }
}

