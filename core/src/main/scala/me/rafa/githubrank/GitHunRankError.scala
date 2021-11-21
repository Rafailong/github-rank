package me.rafa.githubrank

import sttp.model.Uri

sealed trait GitHunRankError extends Any with Product with Serializable { self =>

  def message: String
}

object GitHunRankError {

  /** This error occurs when no response is returned from the GitHub Graph server.
    *
    * @param uri
    * @param error
    */
  final case class FatalServerCommunicationError(uri: Uri, error: Throwable) extends GitHunRankError {

    val message = s"Unable able to communicate with GitHub Graph Service @ '${uri}'.  Details: ${error.getLocalizedMessage()}"
  }

  final case class UnexpectedError(error: Throwable) extends GitHunRankError {

    val message = s"Unexpected error occurred.  Details: ${error.getLocalizedMessage()}"
  }
}
