import { PolicePlainteIhmPage } from './app.po';

describe('police-plainte-ihm App', () => {
  let page: PolicePlainteIhmPage;

  beforeEach(() => {
    page = new PolicePlainteIhmPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
