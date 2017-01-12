// Requirejs Configuration Options
require.config({
  // to set the default folder
  baseUrl: './',
  // paths: maps ids with paths (no extension)
  paths: {
      'jasmine': ['./vendor/jasmine/jasmine'],
      'jasmine-html': ['./vendor/jasmine/jasmine-html'],
      // Check https://github.com/velesin/jasmine-jquery, good
      // for future checks against DOM element manipulation
      //'jasmine-jquery': ['./vendor/jasmine/jasmine-jquery'],
      'jasmine-boot': ['./vendor/jasmine/boot']
  },
  // shim: makes external libraries compatible with requirejs (AMD)
  shim: {
    'jasmine-html': {
      deps : ['jasmine']
    },
    'jasmine-boot': {
      deps : ['jasmine', 'jasmine-html']
    }
  }
});

require(['jasmine-boot'], function () {
  require([
    './game.specs',
    './figures/ghost.specs',
    './figures/pac.specs',
    './levels/level1.specs',
  ], function(){
    //trigger Jasmine
    window.onload();
  })
});
