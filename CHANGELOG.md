# CHANGELOG
Inspired from [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)

## [Unreleased 3.0]

### Added
- Document HTTP/2 support ([#330](https://github.com/opensearch-project/opensearch-java/pull/330))

### Dependencies
- Bumps `org.ajoberstar.grgit:grgit-gradle` from 5.0.0 to 5.2.0
- Bumps `org.eclipse.parsson:parsson` from 1.1.2 to 1.1.3
- Bumps `io.github.classgraph:classgraph` from 4.8.161 to 4.8.162

### Changed
- Migrate client transports to Apache HttpClient / Core 5.x ([#246](https://github.com/opensearch-project/opensearch-java/pull/246))

### Deprecated
- Deprecate RestClientTransport ([#536](https://github.com/opensearch-project/opensearch-java/pull/536))

### Removed
- Remove generated code comments from all files ([#598](https://github.com/opensearch-project/opensearch-java/pull/598))

### Fixed
- Fix version and build ([#254](https://github.com/opensearch-project/opensearch-java/pull/254))
- Fix PutMappingRequest by removing unsupported fields ([#597](https://github.com/opensearch-project/opensearch-java/pull/597))

### Security

## [Unreleased 2.x]

### Added
- Added support for "smartcn" analyzer ([#605](https://github.com/opensearch-project/opensearch-java/pull/605))

### Dependencies

### Changed

### Deprecated

### Removed

### Fixed

### Security

## [2.6.0] - 07/05/2023
### Added
- Add support for knn_vector field type ([#524](https://github.com/opensearch-project/opensearch-java/pull/524))
- Add translog option object and missing translog sync interval option in index settings ([#518](https://github.com/opensearch-project/opensearch-java/pull/518))
- Adds the option to set slices=auto for UpdateByQueryRequest, DeleteByQueryRequest and ReindexRequest ([#538](https://github.com/opensearch-project/opensearch-java/pull/538))
- Add support for approximate k-NN queries ([#548](https://github.com/opensearch-project/opensearch-java/pull/548))

### Dependencies
- Bumps `com.github.jk1.dependency-license-report` from 2.2 to 2.4
- Bumps `io.github.classgraph:classgraph` from 4.8.157 to 4.8.160
- Bumps `jackson` from 2.14.2 to 2.15.2 ((#537)[https://github.com/opensearch-project/opensearch-java/pull/537])
- Update `org.apache.httpcomponents.client5:httpclient5` from `5.1.4` to `5.2.1` and `org.apache.httpcomponents.core5:httpcore5` from `5.1.5` to `5.2.2`

### Changed

### Deprecated
- Deprecate translogDurability and translogFlushThresholdSize in IndexSettings in favor of a separate translog object ([#518](https://github.com/opensearch-project/opensearch-java/pull/518))

### Removed

### Fixed
- Fixed Suggesters for Completion, Term, and Phrase and refactored the Suggestion class ([#477](https://github.com/opensearch-project/opensearch-java/pull/477))
- Fix highlight max_analyzer_offset field name to match with the one introduced in OpenSearch 2.2.0 ([#555](https://github.com/opensearch-project/opensearch-java/pull/555))

### Security

## [2.5.0] - 06/02/2023

### Added
- Add workflow to publish snapshots via GHA ([#454](https://github.com/opensearch-project/opensearch-java/pull/454))
- Added Point-In-Time APIs ([#461](https://github.com/opensearch-project/opensearch-java/pull/461))

### Dependencies
- Bumps `com.github.jk1.dependency-license-report` from 1.19 to 2.2
- Bumps `org.eclipse.parsson:parsson` from 1.1.1 to 1.1.2

### Changed
- Improve time taken by Github actions by using cache ([#439](https://github.com/opensearch-project/opensearch-java/pull/439))
- Introduce intermediary SearchResult for SearchResponse and SearchTemplateResponse classes, enabling similar response handling for both ([#462](https://github.com/opensearch-project/opensearch-java/pull/462))

### Deprecated

### Removed

### Fixed
- Fix missing Highlight and SourceConfig in the MultisearchBody ([#442](https://github.com/opensearch-project/opensearch-java/pull/442))
- Fix search failure with missing required property HitsMetadata.total when trackTotalHits is disabled ([#372](https://github.com/opensearch-project/opensearch-java/pull/372))
- Fix failure when deserialing response for tasks API ([#463](https://github.com/opensearch-project/opensearch-java/pull/463))
- Fix failure when deserializing boolean types for enums ([#463](https://github.com/opensearch-project/opensearch-java/pull/482))
- Fix missing minScore, postFilter, searchAfter, sort, trackScores in the MultisearchBody ([#516](https://github.com/opensearch-project/opensearch-java/pull/516))
### Security

## [2.4.0] - 04/11/2023

### Added
- Add buffered lookahead for Jackson ([#338](https://github.com/opensearch-project/opensearch-java/pull/338))
- Add support for headers and sort parameters in cat requests ([#413](https://github.com/opensearch-project/opensearch-java/pull/413))
- Add support for data stream operations ([#419](https://github.com/opensearch-project/opensearch-java/pull/419))

### Dependencies
- Bumps `io.github.classgraph:classgraph` from 4.8.156 to 4.8.157 ([#408](https://github.com/opensearch-project/opensearch-java/pull/408))

### Changed

### Deprecated

### Removed

### Fixed

### Security

## [2.3.0] - 03/15/2023

### Added
- Require two maintainers to approve release ([#383](https://github.com/opensearch-project/opensearch-java/pull/383))
- Add support for mapping limit settings ([#382](https://github.com/opensearch-project/opensearch-java/pull/382))

### Dependencies
- Bumps `Jackson` from 2.14.1 to 2.14.2 ([#357](https://github.com/opensearch-project/opensearch-java/pull/357))
- Bumps `classgraph` from 4.8.149 to 4.8.156 ([#395](https://github.com/opensearch-project/opensearch-java/pull/395))

### Changed
- Prevent SPI calls at runtime ([#293](https://github.com/opensearch-project/opensearch-java/pull/293))

### Deprecated

### Removed

### Fixed
- Fix issue where completion suggestions were failing, due to being parsed as term suggestions ([#350](https://github.com/opensearch-project/opensearch-java/pull/350))
- Bulk UpdateOperation misses upsert options ([#353](https://github.com/opensearch-project/opensearch-java/pull/353))
- Fix missing key property in the RangeBucket ([#381](https://github.com/opensearch-project/opensearch-java/pull/381))

### Security

## [2.2.0] - 01/23/2023

### Added
- Add Github workflow for changelog verification ([#239](https://github.com/opensearch-project/opensearch-java/pull/239))
- Add Github workflow for dependabot PRs ([#247](https://github.com/opensearch-project/opensearch-java/pull/247))
- Add support for signing service name in AwsSdk2Transport ([#324](https://github.com/opensearch-project/opensearch-java/pull/324))
- Add new OpenSearchTransport based on Apache HttpClient 5 ([#328](https://github.com/opensearch-project/opensearch-java/pull/328))
- Add 1-click release workflows ([#321](https://github.com/opensearch-project/opensearch-java/pull/321))
- Add support for OpenSearch Serverless ([#339](https://github.com/opensearch-project/opensearch-java/pull/339))
- Add support to parse sub-aggregations from filter/nested aggregations ([#234](https://github.com/opensearch-project/opensearch-java/pull/234))
  
### Dependencies
- Bumps `grgit-gradle` from 4.0.1 to 5.0.0
- Update Jackson to 2.14.0 ([#259](https://github.com/opensearch-project/opensearch-java/pull/259))
- Update Gradle to 7.6 ([#311](https://github.com/opensearch-project/opensearch-java/pull/311))

### Changed
- Update literature around changelog contributions in CONTRIBUTING.md ([#242](https://github.com/opensearch-project/opensearch-java/pull/242))
- Update tests to use JUnit's Assert ([#244](https://github.com/opensearch-project/opensearch-java/pull/244))
- Add timeout and throttle to the jenkins workflows ([#231](https://github.com/opensearch-project/opensearch-java/pull/231)) 
- Update maintainers, admins and documentation ([#248](https://github.com/opensearch-project/opensearch-java/pull/248))

### Deprecated
- Deprecate the totalDataSetSize and totalDataSetSizeInBytes fields in the StoreStats ([#498](https://github.com/opensearch-project/opensearch-java/pull/498))


### Removed
- Remove support for unsupported dynamic_templates in bulk ([#276](https://github.com/opensearch-project/opensearch-java/pull/276))

### Fixed
- Make ChildrenAggregate as a SingleBucketAggregate ([#306](https://github.com/opensearch-project/opensearch-java/pull/306))
- Fix /_nodes/stats, /_nodes/info throwing serialization error ([#315](https://github.com/opensearch-project/opensearch-java/pull/315))
- Do not double-wrap OpenSearchException on error ([#323](https://github.com/opensearch-project/opensearch-java/pull/323))
- Fix AwsSdk2TransportOptions.responseCompression ([#322](https://github.com/opensearch-project/opensearch-java/pull/322))
- Fix missing Highlight and SourceConfig in the MultisearchBody ([#442](https://github.com/opensearch-project/opensearch-java/pull/442))
- Fix parsing /_alias error response for not existing alias ([#476](https://github.com/opensearch-project/opensearch-java/pull/476))
- Fix missing cause message in missing permission to call Fine Grained Access Control Amazon OpenSearch domain ([#473](https://github.com/opensearch-project/opensearch-java/issues/473))
- Fix catching JsonParsingException ([#494](https://github.com/opensearch-project/opensearch-java/issues/494))
- Fix StoryStats numeric value out of range of int ([#489](https://github.com/opensearch-project/opensearch-java/pull/489))

### Security

[Unreleased 3.0]: https://github.com/opensearch-project/opensearch-java/compare/2.x...HEAD
[Unreleased 2.x]: https://github.com/opensearch-project/opensearch-java/compare/v2.6.0...2.x
[2.6.0]: https://github.com/opensearch-project/opensearch-java/compare/v2.5.0...v2.6.0
[2.5.0]: https://github.com/opensearch-project/opensearch-java/compare/v2.4.0...v2.5.0
[2.4.0]: https://github.com/opensearch-project/opensearch-java/compare/v2.3.0...v2.4.0
[2.3.0]: https://github.com/opensearch-project/opensearch-java/compare/v2.2.0...v2.3.0
[2.2.0]: https://github.com/opensearch-project/opensearch-java/compare/v2.1.0...v2.2.0