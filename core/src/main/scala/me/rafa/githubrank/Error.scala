package me.rafa.githubrank

import sttp.model.Uri

sealed trait Error extends Any with Product with Serializable { self =>

  def message: String
}

object Error {

  /** This error occurs when no response is returned from the GitHub Graph server.
    *
    * @param uri
    * @param error
    */
  final case class FatalServerCommunicationError(uri: Uri, error: Throwable) extends Error {

    val message =
      s"Unable able to communicate with GitHub Graph Service @ '${uri}'.  Details: ${error.getLocalizedMessage}"
  }

  final case class UnexpectedError(error: Throwable) extends Error {

    val message = s"Unexpected error occurred.  Details: ${error.getLocalizedMessage}"
  }
}
