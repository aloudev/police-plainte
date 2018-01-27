import { FrontIhmPolicePlaintePage } from './app.po';

describe('front-ihm-police-plainte App', () => {
  let page: FrontIhmPolicePlaintePage;

  beforeEach(() => {
    page = new FrontIhmPolicePlaintePage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
