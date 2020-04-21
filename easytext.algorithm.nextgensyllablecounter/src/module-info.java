module easytext.algorithm.nextgensyllablecounter {
  requires easytext.algorithm.api;
  requires syllable.counter;
  requires com.google.guice; // Automatic module: name derived from library jar name

  exports javamodularity.easytext.algorithm.nextgensyllablecounter.guice;
}
