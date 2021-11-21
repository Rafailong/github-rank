package me.rafa.githubrank.logging

import zio.logging.LogAnnotation

trait Annotations {

  val organization = LogAnnotation[String](
    name         = "organization",
    initialValue = "NO_ORG_SPECIFIED",
    combine      = (_, o) => o,
    render       = a => s"$a"
  )
}
